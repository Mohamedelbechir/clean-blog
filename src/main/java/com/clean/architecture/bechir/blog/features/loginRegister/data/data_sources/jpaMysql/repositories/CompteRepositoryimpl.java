package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.repositories;

import java.util.Optional;

import com.clean.architecture.bechir.blog.core.annotations.BlogAppRepostiory;
import com.clean.architecture.bechir.blog.core.exceptions.NotFoundException;
import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.CompteJpa;
import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.UserJpa;
import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.mapper.CompteMapper;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.Compte;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.CompteRepository;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.exceptions.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

@BlogAppRepostiory
public class CompteRepositoryimpl implements CompteRepository {

  @Autowired
  private CompteRepositoryJpa compteRepositoryJpa;

  @Autowired
  private UserRepositoryJpa userRepositoryJpa;

  @Override
  public Optional<Compte> find(String login, String password) {
    Optional<CompteJpa> findedCompte = compteRepositoryJpa.findByLoginAndPassword(login, password);

    if (findedCompte.isPresent()) {
      CompteJpa compte = findedCompte.get();

      return Optional.ofNullable(CompteMapper.jpaToDomain(findedCompte.get()));
    } else {
      return Optional.empty();
    }

  }

  @Override
  public Long add(Compte compte) {
    Long cin = compte.getUser().getCin();
    UserJpa userJpa = userRepositoryJpa.findByCin(cin).orElseThrow(() -> new UserNotFoundException(cin));

    CompteJpa addedCompte = compteRepositoryJpa.save(CompteMapper.domainToEntity(compte, userJpa));
    return addedCompte.getId();
  }

}

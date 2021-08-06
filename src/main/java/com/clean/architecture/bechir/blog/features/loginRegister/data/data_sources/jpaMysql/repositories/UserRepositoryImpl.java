package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.repositories;

import com.clean.architecture.bechir.blog.core.annotations.BlogAppRepostiory;
import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.UserJpa;
import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.mapper.UserMapper;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@BlogAppRepostiory
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    UserRepositoryJpa userRepositoryJpa;

    @Override
    public User add(User user) {
        UserJpa userJpa = UserJpa.builder().cin(user.getCin()).nom(user.getNom()).prenom(user.getPrenom())
                .dateNaissance(user.getDateNaissance()).build();
        UserJpa addedUser = userRepositoryJpa.save(userJpa);
        
        return UserMapper.jpaToDomain(addedUser);
    }

}

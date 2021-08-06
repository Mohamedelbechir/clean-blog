package com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories;

import java.util.Optional;

import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.Compte;

public interface CompteRepository {

    public Optional<Compte> find(String login, String password);

    public Long add(Compte compte);

}

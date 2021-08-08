package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.mapper;

import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.CompteJpa;
import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.UserJpa;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.Compte;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;

public class CompteMapper {

    public static Compte jpaToDomain(CompteJpa compteJpa) {
        UserJpa userJpa = compteJpa.getUserJpa();
        User user = User.builder().cin(userJpa.getCin()).nom(userJpa.getNom()).prenom(userJpa.getPrenom())
                .dateNaissance(userJpa.getDateNaissance()).build();

        return Compte.builder().id(compteJpa.getId()).login(compteJpa.getLogin()).password(compteJpa.getPassword())
                .user(user).build();
    }

    public static CompteJpa domainToEntity(Compte compte, UserJpa userJpa) {

        return CompteJpa.builder().id(compte.getId()).login(compte.getLogin()).password(compte.getPassword())
                .userJpa(userJpa).build();
    }

}

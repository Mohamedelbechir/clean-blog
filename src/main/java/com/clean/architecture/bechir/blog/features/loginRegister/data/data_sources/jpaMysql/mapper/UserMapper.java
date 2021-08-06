package com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.mapper;

import com.clean.architecture.bechir.blog.features.loginRegister.data.data_sources.jpaMysql.entities.UserJpa;
import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;

public class UserMapper {

    public static User jpaToDomain(UserJpa userJpa) {

        User user = User.builder().cin(userJpa.getCin()).nom(userJpa.getNom()).prenom(userJpa.getPrenom())
                .dateNaissance(userJpa.getDateNaissance()).build();
        return user;
    }

    public static  UserJpa domainToEntity(User user) {

        UserJpa userJpa = UserJpa.builder().cin(user.getCin()).nom(user.getNom()).prenom(user.getPrenom())
                .dateNaissance(user.getDateNaissance()).build();

        return userJpa;

    }

}

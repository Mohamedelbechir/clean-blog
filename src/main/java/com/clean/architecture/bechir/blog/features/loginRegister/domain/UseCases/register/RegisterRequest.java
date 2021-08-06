package com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.register;

import com.clean.architecture.bechir.blog.features.loginRegister.domain.entities.User;

public class RegisterRequest {
    final User user;
    final String login;
    final String password;

    public RegisterRequest(User user, String login, String password) {
        this.user = user;
        this.login = login;
        this.password = password;
    }

}

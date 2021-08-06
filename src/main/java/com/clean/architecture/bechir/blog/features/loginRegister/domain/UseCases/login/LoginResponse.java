package com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.login;

public class LoginResponse {

    final public String token;

    public LoginResponse(String token) {

        this.token = token;
    }

    public LoginResponse() {
        this.token = "";
    }

}

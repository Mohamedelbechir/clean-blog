package com.clean.architecture.bechir.blog.features.loginRegister.domain.UseCases.register;

public class RegisterResponse {
    final public String token;

    public RegisterResponse(String token) {
        this.token = token;
    }

    public RegisterResponse() {
        this.token = "";
    }

}

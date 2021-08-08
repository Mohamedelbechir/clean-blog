package com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.exceptions;

public class CompteNotFoundException extends RuntimeException {

    public CompteNotFoundException(String message) {
        super(message);
    }

}

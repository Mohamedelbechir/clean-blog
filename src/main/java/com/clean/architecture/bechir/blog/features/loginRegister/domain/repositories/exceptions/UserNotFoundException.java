package com.clean.architecture.bechir.blog.features.loginRegister.domain.repositories.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long cin) {
        super("User with cin " + cin + " not found");
    }

}

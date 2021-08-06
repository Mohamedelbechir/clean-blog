package com.clean.architecture.bechir.blog.core.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super();
    }
    public NotFoundException(String message) {
        super(message);
    }

}
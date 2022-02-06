package com.bilgeadam.odevsehirapp.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class SehirNotFoundException extends RuntimeException{
    public SehirNotFoundException(String message) {
        super(message);
    }
}

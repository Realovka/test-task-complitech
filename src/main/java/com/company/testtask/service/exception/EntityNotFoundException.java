package com.company.testtask.service.exception;

import lombok.Getter;

@Getter
public class EntityNotFoundException extends RuntimeException {

    private String messageKey;
    private Object value;

    public EntityNotFoundException(String messageKey, Object value) {
        this.messageKey = messageKey;
        this.value = value;
    }

    public EntityNotFoundException() {
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityNotFoundException(Throwable cause) {
        super(cause);
    }
}

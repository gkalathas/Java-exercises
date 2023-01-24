package org.example.exception;

import javax.naming.InsufficientResourcesException;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

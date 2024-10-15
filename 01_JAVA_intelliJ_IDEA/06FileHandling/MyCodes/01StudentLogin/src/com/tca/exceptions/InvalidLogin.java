package com.tca.exceptions;

public class InvalidLogin extends RuntimeException {
    public InvalidLogin(String message) {
        super(message);
    }
}

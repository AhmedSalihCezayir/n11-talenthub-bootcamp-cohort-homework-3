package com.n11.homework3.exception;

public class NoSuchCountryCodeException extends RuntimeException {
    public NoSuchCountryCodeException(String message) {
        super(message);
    }
}

package com.changeside.medium.exception;

public class UsernotFoundException extends RuntimeException{
    public UsernotFoundException(String message) {
        super(message);
    }
}

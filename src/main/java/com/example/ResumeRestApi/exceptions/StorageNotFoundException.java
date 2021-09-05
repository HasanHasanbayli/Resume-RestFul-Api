package com.example.ResumeRestApi.exceptions;

public class StorageNotFoundException extends StorageException {

    public StorageNotFoundException(String message) {
        super(message);
    }

    public StorageNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
package ru.spmi.lk.exceptions;

import java.io.IOException;

public class NotAuthorizedException extends Exception {

    public NotAuthorizedException(String s) {
        super(s);
    }
}

package com.inetexltd.mycontacts.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotFoundRuntimeExeption extends RuntimeException {

    public NotFoundRuntimeExeption(String message) {
        super(message);
    }
}

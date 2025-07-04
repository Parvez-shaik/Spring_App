package com.learning.springapi.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunException extends RuntimeException{
    public RunException(){
        super("Run Not FOUND!.");
    }
}

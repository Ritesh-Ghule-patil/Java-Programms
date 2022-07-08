package com.exception.model;

public class UnderAgeException extends RuntimeException {

    public UnderAgeException(){
        super("You are under age");
    }
    public UnderAgeException(String msg){
        super(msg);
    }
}

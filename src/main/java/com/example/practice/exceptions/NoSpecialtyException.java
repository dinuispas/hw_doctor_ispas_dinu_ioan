package com.example.practice.exceptions;

public class NoSpecialtyException extends Exception{
    public NoSpecialtyException(){
        super("Specialty doesn't exist");
    }
}

package br.com.trabalho2.exception;

public class RunException extends RuntimeException{

    String message = "";

    public RunException(){}

    public RunException(String message){
        super(message);
    }
}

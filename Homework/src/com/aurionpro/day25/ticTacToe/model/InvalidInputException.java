package com.aurionpro.day25.ticTacToe.model;
public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        super("Invalid Cell Location");
    }
}

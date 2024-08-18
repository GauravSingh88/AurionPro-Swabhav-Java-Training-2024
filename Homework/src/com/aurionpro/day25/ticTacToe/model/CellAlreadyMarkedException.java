package com.aurionpro.day25.ticTacToe.model;
public class CellAlreadyMarkedException extends RuntimeException {
    public CellAlreadyMarkedException(String message) {
        super(message);
    }
}

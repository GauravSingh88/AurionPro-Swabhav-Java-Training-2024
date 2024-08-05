package com.aurionpro.day23.ticTacToe1.model;

public class Player {
	private char symbol;

	public Player(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public void playerSwitch() {
		if (this.symbol == 'X') {
			this.symbol = 'O';
			return;
		}
		this.symbol = 'X';
	}

	public void play(int row, int column, char[][] board) {
		if (board[row][column] == '-') {
			board[row][column] = symbol;
		} else {
			System.out.println("That move cannot be performed");
		}
	}
}
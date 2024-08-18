package com.aurionpro.day25.ticTacToe.test;

import java.util.Scanner;

import com.aurionpro.day25.ticTacToe.model.Board;
import com.aurionpro.day25.ticTacToe.model.CellAlreadyMarkedException;
import com.aurionpro.day25.ticTacToe.model.InvalidInputException;
import com.aurionpro.day25.ticTacToe.model.MarkType;
import com.aurionpro.day25.ticTacToe.model.ResultAnalyzer;
import com.aurionpro.day25.ticTacToe.model.ResultType;

public class TicTacToeTest {
    public static void main(String[] args) {

        Board board = new Board();
        ResultAnalyzer analyzer = new ResultAnalyzer(board, ResultType.PROGRESS);

        MarkType currentPlayer = MarkType.X;
        ResultType gameResult = ResultType.PROGRESS;

        Scanner scanner = new Scanner(System.in);

        while (gameResult == ResultType.PROGRESS) {
            board.displayBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter Cell (0-8): ");
            int cell = scanner.nextInt();

            try {
                board.setCellMark(cell, currentPlayer);
                gameResult = analyzer.analyzeResult();

                if (gameResult == ResultType.WIN) {
                    board.displayBoard();
                    System.out.println("Player " + currentPlayer + " Wins!!!!!");
                } else if (gameResult == ResultType.DRAW) {
                    board.displayBoard();
                    System.out.println("Match is a Draw");
                } else {
                    currentPlayer = (currentPlayer == MarkType.X) ? MarkType.O : MarkType.X;
                }

            } catch (CellAlreadyMarkedException e) {
                System.out.println("Cell is already marked, try again.");
            } catch (InvalidInputException e) {
                System.out.println("Invalid cell location, try again.");
            }
        }

        scanner.close();
    }
}

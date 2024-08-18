package com.aurionpro.day25.ticTacToe.model;
public class ResultAnalyzer {

    private Board board;
    private ResultType result;

    public ResultAnalyzer(Board board, ResultType result) {
        this.board = board;
        this.result = result;
    }

    public void horizontalWinCheck() {
        for (int i = 0; i < 3; i++) {
            if (board.getCell()[i * 3].getMark() == board.getCell()[i * 3 + 1].getMark() &&
                board.getCell()[i * 3 + 1].getMark() == board.getCell()[i * 3 + 2].getMark() &&
                !board.getCell()[i * 3].isEmpty()) {

                result = ResultType.WIN;
                return;
            }
        }
    }

    public void verticalWinCheck() {
        for (int i = 0; i < 3; i++) {
            if (board.getCell()[i].getMark() == board.getCell()[i + 3].getMark() &&
                board.getCell()[i + 3].getMark() == board.getCell()[i + 6].getMark() &&
                !board.getCell()[i].isEmpty()) {

                result = ResultType.WIN;
                return;
            }
        }
    }

    public void diagonalWinCheck() {
        if (board.getCell()[0].getMark() == board.getCell()[4].getMark() &&
            board.getCell()[4].getMark() == board.getCell()[8].getMark() &&
            !board.getCell()[0].isEmpty()) {

            result = ResultType.WIN;
            return;
        }

        if (board.getCell()[2].getMark() == board.getCell()[4].getMark() &&
            board.getCell()[4].getMark() == board.getCell()[6].getMark() &&
            !board.getCell()[2].isEmpty()) {

            result = ResultType.WIN;
        }
    }

    public ResultType analyzeResult() {
        horizontalWinCheck();
        if (result == ResultType.WIN) return result;

        verticalWinCheck();
        if (result == ResultType.WIN) return result;

        diagonalWinCheck();
        if (result == ResultType.WIN) return result;

        if (board.isBoardFull()) {
            result = ResultType.DRAW;
        } else {
            result = ResultType.PROGRESS;
        }
        return result;
    }
}

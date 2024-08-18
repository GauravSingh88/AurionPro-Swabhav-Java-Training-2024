package com.aurionpro.day25.ticTacToe.model;
public class Cell {

    private MarkType mark;

    public MarkType getMark() {
        return mark;
    }

    public void setMark(MarkType mark) throws CellAlreadyMarkedException {
        if (!isEmpty()) {
            throw new CellAlreadyMarkedException("Cell is already marked");
        }
        this.mark = mark;
    }

    public Cell() {
        this.mark = MarkType.EMPTY;
    }

    public boolean isEmpty() {
        return this.mark == MarkType.EMPTY;
    }
}

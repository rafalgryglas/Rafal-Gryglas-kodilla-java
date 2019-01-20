package com.kodilla.sudoku;

public class Move {
    private int row;
    private int col;
    private Integer value;

    public Move(int row, int col, Integer value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Integer getValue() {
        return value;
    }
}

package com.kodilla.sudoku;

public class SudokuSetupExample {

    public static void fillExampleSudoku(SudokuBoard sudokuBoard) {
        sudokuBoard.setValue(0, 3, 2);
        sudokuBoard.setValue(0, 8, 3);
        sudokuBoard.setValue(1, 1, 7);
        sudokuBoard.setValue(1, 4, 9);
        sudokuBoard.setValue(1, 6, 2);
        sudokuBoard.setValue(2, 1, 6);
        sudokuBoard.setValue(2, 2, 1);
        sudokuBoard.setValue(2, 3, 5);
        sudokuBoard.setValue(2, 4, 8);
        sudokuBoard.setValue(2, 7, 4);
        sudokuBoard.setValue(2, 8, 9);
        sudokuBoard.setValue(3, 0, 8);
        sudokuBoard.setValue(3, 5, 4);
        sudokuBoard.setValue(3, 8, 1);
        sudokuBoard.setValue(5, 0, 7);
        sudokuBoard.setValue(5, 3, 8);
        sudokuBoard.setValue(5, 8, 4);
        sudokuBoard.setValue(6, 0, 5);
        sudokuBoard.setValue(6, 1, 9);
        sudokuBoard.setValue(6, 4, 7);
        sudokuBoard.setValue(6, 5, 8);
        sudokuBoard.setValue(6, 6, 3);
        sudokuBoard.setValue(6, 7, 1);
        sudokuBoard.setValue(7, 2, 4);
        sudokuBoard.setValue(7, 4, 3);
        sudokuBoard.setValue(7, 7, 5);
        sudokuBoard.setValue(8, 0, 6);
        sudokuBoard.setValue(8, 5, 1);
    }

    public static void fillExampleSudoku2(SudokuBoard sudokuBoard) {
        sudokuBoard.setValue(0, 1, 2);
        sudokuBoard.setValue(0, 3, 5);
        sudokuBoard.setValue(0, 5, 1);
        sudokuBoard.setValue(0, 7, 9);
        sudokuBoard.setValue(1, 0, 8);
        sudokuBoard.setValue(1, 3, 2);
        sudokuBoard.setValue(1, 5, 3);
        sudokuBoard.setValue(1, 8, 6);
        sudokuBoard.setValue(2, 1, 3);
        sudokuBoard.setValue(2, 4, 6);
        sudokuBoard.setValue(2, 7, 7);
        sudokuBoard.setValue(3, 2, 1);
        sudokuBoard.setValue(3, 6, 6);
        sudokuBoard.setValue(4, 0, 5);
        sudokuBoard.setValue(4, 1, 4);
        sudokuBoard.setValue(4, 7, 1);
        sudokuBoard.setValue(4, 7, 1);
        sudokuBoard.setValue(4, 8, 9);
        sudokuBoard.setValue(5, 2, 2);
        sudokuBoard.setValue(5, 6, 7);
        sudokuBoard.setValue(6, 1, 9);
        sudokuBoard.setValue(6, 4, 3);
        sudokuBoard.setValue(6, 7, 8);
        sudokuBoard.setValue(7, 0, 2);
        sudokuBoard.setValue(7, 3, 8);
        sudokuBoard.setValue(7, 5, 4);
        sudokuBoard.setValue(7, 8, 7);
        sudokuBoard.setValue(8, 1, 1);
        sudokuBoard.setValue(8, 3, 9);
        sudokuBoard.setValue(8, 5, 7);
        sudokuBoard.setValue(8, 7, 6);
    }
}
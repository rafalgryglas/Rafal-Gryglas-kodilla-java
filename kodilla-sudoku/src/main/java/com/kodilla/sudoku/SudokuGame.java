package com.kodilla.sudoku;

import java.util.List;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuGame {

    public static boolean resolveSudoku(SudokuBoard sudokuBoard) {
        boolean changed = true;
        int count = 1;
        while (changed) {
            System.out.println("Number of algorithm loop: " + count);
            changed = false;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getValue(row, col).equals(EMPTY)) {
                        removeRowDuplicates(sudokuBoard, row, col);
                        removeColDuplicates(sudokuBoard, row, col);
                        removeBoxDuplicates(sudokuBoard, row, col);
                    }
                }
            }
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getValue(row, col).equals(EMPTY)) {
                        if (sudokuBoard.getPossibles(row, col).size() == 1) {
                            Integer v = sudokuBoard.getPossibles(row, col).get(0);
                            sudokuBoard.setValue(row, col, v);
                            changed = true;

                        }
                    }
                }
            }
            count++;
            System.out.println(sudokuBoard);
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudokuBoard.getValue(row, col).equals(EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void removeRowDuplicates(SudokuBoard sudokuBoard, int row, int col) {
        for (int n = 0; n < 9; n++) {
            Integer v = sudokuBoard.getValue(row, n);
            if (sudokuBoard.getPossibles(row, col).contains(v)) {
                sudokuBoard.getPossibles(row, col).remove(v);
            }
        }
    }

    private static void removeColDuplicates(SudokuBoard sudokuBoard, int row, int col) {
        for (int n = 0; n < 9; n++) {
            Integer v = sudokuBoard.getValue(n, col);
            if (sudokuBoard.getPossibles(row, col).contains(v)) {
                sudokuBoard.getPossibles(row, col).remove(v);
            }
        }
    }

    private static void removeBoxDuplicates(SudokuBoard sudokuBoard, int row, int col) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                int boxRow = row / 3;
                int boxCol = col / 3;
                Integer v = sudokuBoard.getValue(r + boxRow * 3, c + boxCol * 3);
                if (sudokuBoard.getPossibles(row, col).contains(v)) {
                    sudokuBoard.getPossibles(row, col).remove(v);
                }
            }
        }
    }

    public static boolean getResolveSudokuCopy(SudokuBoard sudokuBoard) {
        if (!resolveSudoku(sudokuBoard)) {

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getValue(row, col).equals(EMPTY)) {
                        if (sudokuBoard.getPossibles(row, col).size() > 1) {
                            List<Integer> valuePossibleList = sudokuBoard.getPossibles(row, col);
                            Integer vPossible = valuePossibleList.get(0);
                            sudokuBoard.setValue(row, col, vPossible);
                            valuePossibleList.remove(0);
                            SudokuBoard sudokuBoardPossible = sudokuBoard;
                            resolveSudoku(sudokuBoardPossible);
                        }
                    }
                }
            }
        }
        return true;
    }
}
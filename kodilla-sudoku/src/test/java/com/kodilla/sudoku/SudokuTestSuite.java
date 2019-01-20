package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTestSuite {

    @Test
    public void resolveExampleSudoku() {
        //Given

        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println("Empty sudoku board: \n" + sudokuBoard);
        //When
        SudokuSetupExample.fillExampleSudoku(sudokuBoard);
        System.out.println("Example sudoku board: \n" +sudokuBoard + "Start algorithm ");

        boolean isResolve = SudokuGame.resolveSudoku(sudokuBoard);
        //Then
        Assert.assertTrue(isResolve);

    }
    @Test
    public void resolveExampleSudokuWithCopy() {
        //Given

        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println("Empty sudoku board: \n" + sudokuBoard);
        //When
        SudokuSetupExample.fillExampleSudoku2(sudokuBoard);
        System.out.println("Example sudoku board: \n" +sudokuBoard + "Start algorithm ");

        boolean isResolve = SudokuGame.getResolveSudokuCopy(sudokuBoard);
        //Then
        Assert.assertTrue(isResolve);

    }
}
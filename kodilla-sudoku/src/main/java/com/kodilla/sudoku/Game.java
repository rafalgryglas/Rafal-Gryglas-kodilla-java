package com.kodilla.sudoku;

public class Game {
    public boolean sudokuStart() {
        SudokuBoard board = new SudokuBoard();
        while (true) {
            System.out.println(board);
            UserSelection userSelection = UserDialogs.getUserSelection();
            switch (userSelection) {
                case QUIT:
                    return false;
                case VALUE:
                    Move move = UserDialogs.getMove();
                    board.setValue(move.getRow(), move.getCol(), move.getValue());
                    break;
                case EXAMPLE:
                    board = new SudokuBoard();
                    SudokuSetupExample.fillExampleSudoku(board);
                    break;
                case RESOLVE:
                    SudokuGame.resolveSudoku(board);
                    if (UserDialogs.oneMoreSudokuGame()) {
                        board = new SudokuBoard();
                        break;
                    } else {
                        return false;
                    }
                case DELETE_VALUE:
                    Move moveToDelete = UserDialogs.removeMove();
                    board.setValue(moveToDelete.getRow(), moveToDelete.getCol(), moveToDelete.getValue());
                    break;
            }
        }
    }
}
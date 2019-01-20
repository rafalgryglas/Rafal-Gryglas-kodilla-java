package com.kodilla.sudoku;

import java.util.Scanner;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class UserDialogs {
    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do: \n" +
                    "(S) - set values on Your sudoku \n" +
                    "(E) - show example sudoku \n" +
                    "(D) - delete value from your sudoku \n" +
                    "(R) - resolve sudoku \n" +
                    "(Q) - quit");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("S")) {
                return UserSelection.VALUE;
            } else if (s.equals("E")) {
                return UserSelection.EXAMPLE;
            } else if (s.equals("Q")) {
                return UserSelection.QUIT;
            } else if (s.equals("D")) {
                return UserSelection.DELETE_VALUE;
            } else if (s.equals("R")) {
                return UserSelection.RESOLVE;
            } else {
                System.out.println("Wrong key: use (S), (E), (Q), (D), (R)");
            }
        }
    }

    public static Move getMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give me your number: Example: '123' , where: \n"
                    + "'1' - row, '2' - column, '3' - value \n");
            String s = scanner.nextLine().toUpperCase();
            if (s.length() != 3) {
                System.out.println("Wrong data. Only 3 numbers between '1-9");
            } else {
                try {
                    int r = Integer.parseInt(s.substring(0, 1));
                    int c = Integer.parseInt(s.substring(1, 2));
                    Integer v = Integer.parseInt(s.substring(2, 3));
                    if (r == 0 || c == 0 || v == 0) {
                        System.out.println("Row, column and value must be between 1-9");
                    } else {
                        Move move = new Move(r - 1, c - 1, v);
                        return move;
                    }
                } catch (Exception e) {
                    System.out.println("Wrong data");
                }
            }
        }
    }

    public static Move removeMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give me your number: Example: '12' , where: \n"
                    + "'1' - row, '2' - column, \n");
            String s = scanner.nextLine().toUpperCase();
            if (s.length() != 2) {
                System.out.println("Wrong data. Only 2 numbers between '1-9");
            } else {
                try {
                    int r = Integer.parseInt(s.substring(0, 1));
                    int c = Integer.parseInt(s.substring(1, 2));
                    if (r == 0 || c == 0) {
                        System.out.println("Row and column must be between 1-9");
                    } else {
                        Move move = new Move(r - 1, c - 1, EMPTY);
                        return move;
                    }
                } catch (Exception e) {
                    System.out.println("Wrong data");
                }
            }
        }
    }

    public static boolean oneMoreSudokuGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What to you want to do? (N) - new sudoku game, (X) - exit");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("N")) {
                return true;
            } else if (s.equals("X")) {
                System.out.println("See you soon");
                return false;
            } else {
                System.out.println("Wrong key! Use (N) or (X)");
            }
        }
    }
}
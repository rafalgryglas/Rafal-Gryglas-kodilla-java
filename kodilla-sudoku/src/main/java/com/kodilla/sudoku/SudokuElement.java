package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SudokuElement {
    private Integer value;
    public static Integer EMPTY = -1;
    private List<Integer> possibles = new ArrayList<>();

    public List<Integer> getPossibles() {
        return possibles;
    }

    public SudokuElement() {
        this.value = EMPTY;
        for (int n = 1; n <= 9; n++) {
            possibles.add(n);
        }
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == EMPTY) {
            return "   ";
        } else {
            return " " + value + " ";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuElement that = (SudokuElement) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


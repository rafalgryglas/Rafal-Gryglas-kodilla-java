package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SudokuRow {
    private List<SudokuElement> rowElements = new ArrayList<>();

    public SudokuRow() {
        for (int n = 0; n < 9; n++) {
           this.rowElements.add(new SudokuElement());
        }
    }
    public SudokuRow(List<SudokuElement> rowElements) {
        this.rowElements = rowElements;
    }

    public List<SudokuElement> getRowElements() {
        return rowElements;
    }

    @Override
    public String toString() {
        return rowElements.stream()
                .map(SudokuElement::toString)
                .collect(Collectors.joining("|"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuRow sudokuRow = (SudokuRow) o;
        return Objects.equals(rowElements, sudokuRow.rowElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowElements);
    }
}

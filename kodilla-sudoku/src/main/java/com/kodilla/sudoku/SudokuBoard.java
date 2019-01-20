package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SudokuBoard {
    public List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for (int k = 0; k < 9; k++) {
            this.rows.add(new SudokuRow());
        }
    }

    public Integer getValue(int row, int col) {
        return rows.get(row).getRowElements().get(col).getValue();
    }

    public void setValue(int row, int col, Integer value) {
        rows.get(row).getRowElements().get(col).setValue(value);
    }

    public List<Integer> getPossibles(int row, int col) {
        return rows.get(row).getRowElements().get(col).getPossibles();
    }

    @Override
    public String toString() {
        return rows.stream()
                .map(k -> k.toString() + "\n")
                .collect(Collectors.joining());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuBoard that = (SudokuBoard) o;
        return Objects.equals(rows, that.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }
}


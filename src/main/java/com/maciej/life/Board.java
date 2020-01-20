package com.maciej.life;

import java.util.Arrays;
import java.util.Objects;

public class Board {
    private final int width;
    private final int height;
    private boolean[][] values;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        values = new boolean[height][width];
    }

    public boolean getField(int row, int column) {
        return values[row][column];
    }

    public void setField(int row, int column, boolean value) {
        this.values[row][column] = value;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int countNeighbours(int row, int column) {
        int result = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = column - 1; c <= column + 1; c++) {
                if ((c >= 0 && c < width && r >= 0 && r < height)
                        && !(c == column && r == row)
                        && values[r][c]) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < height; r++) {
            sb.append('\n');
            for (int c = 0; c < width; c++) {
                sb.append(values[r][c] ? "#" : ".");
            }

        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        for(int r= 0; r<height; r++) {
            if(!Arrays.equals(values[r], board.values[r])) {
                return false;
            }
        }

        return width == board.width &&
                height == board.height;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(width, height);
        result = 31 * result + Arrays.hashCode(values);
        return result;
    }
}

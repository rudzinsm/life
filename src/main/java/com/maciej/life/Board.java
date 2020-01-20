package com.maciej.life;

public class Board {
    private final int width;
    private final int height;
    private boolean[][] values;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean getField(int row, int column) {
        return values[row][column];
    }

    public void setField(int row, int column, boolean value) {
        this.values = values;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int r = 0 ; r < height; r++) {
            sb.append('\n');
            for(int c = 0 ; c < width; c++) {
                sb.append(values[r][c] ?"#":".");
            }

        }

        return sb.toString();
    }



}

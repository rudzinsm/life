package com.maciej.life;

public class Solution {

    Board tick(Board beforeTick) {
        Board result = new Board(beforeTick.getWidth(), beforeTick.getHeight());
        for (int r = 0; r < beforeTick.getHeight(); r++) {
            for (int c = 0; c < beforeTick.getWidth(); c++) {
                int neighbours = beforeTick.countNeighbours(r, c);
                if (beforeTick.getField(r, c)) {
                    if (neighbours < 2) {
                        result.setField(r,c,false);
                    } else if (neighbours < 4) {
                        result.setField(r,c,true);
                    } else {
                        result.setField(r,c,false);
                    }
                } else {
                    if(neighbours == 3) {
                        result.setField(r,c,true);
                    }
                }
            }
        }
        return result;
    }



}

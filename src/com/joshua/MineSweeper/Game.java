package com.joshua.MineSweeper;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    final int MINE_COUNT = 10;
    final int MAP_SIZE = 10;

    public void init(Board board) {
        ArrayList<Point> pointList = new ArrayList<>(100);
        for(int i = 0; i < MAP_SIZE; i++) {
            for(int j = 0; j < MAP_SIZE; j++) {
                pointList.add(new Point(i, j));
            }
        }

        Collections.shuffle(pointList);

        for(int i = 0; i < MINE_COUNT; i++) {
            board.setColumn(pointList.get(i), Board.Status.MINE);
        }
    }

    public void gameOver() {

    }

    public boolean isCleared(Board board) {
        return board.getOpenedCount() + MINE_COUNT == MAP_SIZE * MAP_SIZE;
    }

    public void run() {
        Board board = new Board();
        init(board);

        while(true) {


            if(isCleared(board)) {
                break;
            }
        }

        gameOver();
    }
}

package com.joshua.MineSweeper;

public class Board {
    final int MAP_SIZE = 10;
    int[][] board = new int[MAP_SIZE][MAP_SIZE];

    public Board() {
    }

    public boolean isOpened(int x, int y) {
        return board[x][y] == 2;
    }

    public void openColumn(int x, int y) {
        board[x][y] = 2;
    }
}

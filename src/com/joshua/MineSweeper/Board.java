package com.joshua.MineSweeper;

public class Board {
    final int MAP_SIZE = 10;
    int[][] board = new int[MAP_SIZE][MAP_SIZE];

    public Board() {
    }

    public boolean isOpened(Point p) {
        return Status.OPENED.getValue() == board[p.x][p.y];
    }

    public boolean isChecked(Point p) {
        return Status.CHECKED.getValue() == board[p.x][p.y];
    }

    public boolean isClosed(Point p) {
        return Status.CLOSED.getValue() == board[p.x][p.y];
    }

    public boolean isMine(Point p) {
        return Status.MINE.getValue() == board[p.x][p.y];
    }

    public void setColumn(Point p, Status s) {
        this.board[p.x][p.y] = s.getValue();
    }

    public void setOpened(Point p) {
        if(isChecked(p) || isClosed(p)) {
            setColumn(p, Status.OPENED);
        }
    }

    public int getOpenedCount() {
        int count = 0;
        for(int i = 0; i < MAP_SIZE; i++) {
            for(int j = 0; j < MAP_SIZE; j++) {
                if(this.board[i][j] == Status.OPENED.getValue()) {
                    count++;
                }
            }
        }

        return count;
    }

    public enum Status {
        CLOSED('□', 0),
        OPENED(' ', 1),
        CHECKED('v', 2),
        STRIKE('x', 8),
        MINE('□', 9);

        private char mark;
        private int value;

        Status() {

        }

        private Status(char mark, int value) {
            this.mark = mark;
            this.value = value;
        }

        public char getMark() {
            return this.mark;
        }

        public int getValue() {
            return this.value;
        }
    }
}

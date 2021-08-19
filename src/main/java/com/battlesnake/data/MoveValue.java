package com.battlesnake.data;

public class MoveValue {

    public double returnValue;
    public Move returnMove;

    //transposition
    public int depth;

    public enum FLAG {
        EXACT,
        LOWERBOUND,
        UPPERBOUND
    }

    public FLAG flag;

    public MoveValue() {
        returnValue = 0;
    }

    public MoveValue(double returnValue, int depth) {
        this.returnValue = returnValue;
        this.depth = depth;
    }

    public MoveValue(double returnValue, Move returnMove, int depth) {
        this.returnValue = returnValue;
        this.returnMove = returnMove;
        this.depth = depth;
    }
}

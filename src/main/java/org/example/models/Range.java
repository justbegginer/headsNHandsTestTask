package org.example.models;

import java.util.Random;

public class Range {

    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getRandomValue(){
        return new Random().nextInt(start, end+1);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.start, this.end);
    }
}

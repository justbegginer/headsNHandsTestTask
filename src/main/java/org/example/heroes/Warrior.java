package org.example.heroes;

import org.example.models.Range;

public class Warrior extends Player{
    public Warrior(boolean isNeedToBePrinted) {
        super(20, 300, 30, new Range(2, 20), 2, isNeedToBePrinted);
    }
}

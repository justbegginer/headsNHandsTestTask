package org.example.heroes;

import org.example.models.Range;

public class Archer extends Player{
    public Archer(boolean isNeedToBePrinted) {
        super(20, 200, 20, new Range(10, 30), 3, isNeedToBePrinted);
    }
}

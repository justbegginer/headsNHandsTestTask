package org.example.monsters;

import org.example.models.Creature;
import org.example.models.Range;

public class Skeleton extends Creature {
    public Skeleton(boolean isNeedToBePrinted) {
        super(30, 100, 10, new Range(10, 30), isNeedToBePrinted);
    }
}

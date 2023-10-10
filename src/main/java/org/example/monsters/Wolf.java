package org.example.monsters;

import org.example.models.Creature;
import org.example.models.Range;

public class Wolf extends Creature {
    public Wolf(boolean isNeedToBePrinted) {
        super(30, 150, 15, new Range(1, 20), isNeedToBePrinted);
    }
}

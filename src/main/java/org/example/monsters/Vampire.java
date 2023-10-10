package org.example.monsters;

import org.example.models.Creature;
import org.example.models.Range;

public class Vampire extends Creature {
    public Vampire(boolean isNeedToBePrinted) {
        super(30, 250, 30, new Range(10, 30), isNeedToBePrinted);
    }
}

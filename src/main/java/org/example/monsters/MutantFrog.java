package org.example.monsters;

import org.example.models.Creature;
import org.example.models.Range;

public class MutantFrog extends Creature {
    public MutantFrog(boolean isNeedToBePrinted) {
        super(20, 100, 10, new Range(1, 10), isNeedToBePrinted);
    }
}

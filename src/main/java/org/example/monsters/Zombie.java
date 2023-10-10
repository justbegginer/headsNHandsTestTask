package org.example.monsters;

import org.example.models.Creature;
import org.example.models.Range;

public class Zombie extends Creature {
    public Zombie(boolean isNeedToBePrinted) {
        super(20, 250, 30, new Range(1, 20), isNeedToBePrinted);
    }
}

package org.example.heroes;

import org.example.models.Range;

public class Mage extends Player{

    public Mage(boolean isNeedToBePrinted) {
        super(25, 150, 10,new Range(30, 35), 4, isNeedToBePrinted);
    }
}

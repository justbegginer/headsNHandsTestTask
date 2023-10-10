package org.example.heroes;

import org.example.models.Creature;
import org.example.models.Range;

public abstract class Player extends Creature {
    private int healsCount;

    public Player(int attack, int hp, int protection, Range damage, int healsCount, boolean isNeedToBePrinted) {
        super(attack, hp, protection, damage, isNeedToBePrinted);
        this.healsCount = healsCount;
    }

    @Override
    protected boolean isAliveAfterGetDamage() {
        if(!super.isAliveAfterGetDamage()){
            if (healsCount > 0){
                setHp(getInitialHp()*3/10);
                healsCount--;
                print(this + " HEALS YOURSELF");
                return true;
            }
            else {
                print(this + " can't heals yourself anymore and can't be REVIVED");
                return false;
            }
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" ; healsCount: "+healsCount;
    }
}

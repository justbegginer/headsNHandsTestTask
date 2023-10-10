package org.example.models;

import java.util.Random;

public abstract class Creature extends Logged {
    private int attack;
    private int hp;

    private int initialHp;
    private int protection;
    private Range damage;

    public Creature(int attack, int hp, int protection, Range damage, boolean isNeedToBePrinted) {
        super(isNeedToBePrinted);
        if (!(attack >= 1 && attack <= 30)) {
            throw new IllegalArgumentException("Damage must be between 1 and 30");
        }
        if (!(protection >= 1 && protection <= 30)) {
            throw new IllegalArgumentException("Protection must be between 1 and 30");
        }
        this.attack = attack;
        this.hp = hp;
        this.initialHp = hp;
        this.protection = protection;
        this.damage = damage;
    }

    public void dealDamage(Creature creature) {
        if (isAttackSuccessful(creature.getProtection())) {
            creature.isAliveAfterGetDamage();
        }
    }

    private boolean isAttackSuccessful(int protection) {
        int attackModifier = this.attack - protection;
        if (attackModifier < 1) {
            attackModifier = 1;
        }
        for (int i = 0; i < attackModifier; i++) {
            if (new Random().nextInt(1, 6 + 1) > 4) {
                print(this + " attacks successfully");
                return true;
            }
        }
        print(this + " attacks failed");
        return false;
    }

    private int dealDamage() {
        return damage.getRandomValue();
    }


    protected boolean isAliveAfterGetDamage() {
        int damage = dealDamage();
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        print(this + " deal damage " + damage);
        boolean isAlive = isAlive();
        if (!isAlive) {
            print(this + " DIED");
        }
        return isAlive;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getProtection() {
        return protection;
    }

    public int getInitialHp() {
        return initialHp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + String.format(" damage: %s; attack: %d, hp: %d; protection: %d",
                this.damage, this.attack, this.hp, this.protection);
    }
}

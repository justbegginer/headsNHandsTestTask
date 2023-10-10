package org.example;

import org.example.models.Creature;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {

    private List<Creature> leftSide;

    private List<Creature> rightSide;

    {
        leftSide = new LinkedList<>();
        rightSide = new LinkedList<>();
    }

    public Game(Creature leftSide, List<Creature> rightSide) {
        this.leftSide.add(leftSide);
        this.rightSide.addAll(rightSide);
    }

    public Game(List<Creature> leftSide, Creature rightSide) {
        this.leftSide.addAll(leftSide);
        this.rightSide.add(rightSide);
    }

    public Game(Creature leftSide, Creature rightSide) {
        this.leftSide.add(leftSide);
        this.rightSide.add(rightSide);
    }

    public Game(List<Creature> leftSide, List<Creature> rightSide) {
        this.leftSide.addAll(leftSide);
        this.rightSide.addAll(rightSide);
    }

    void makeMove() {
        Creature leftCreature = this.leftSide.get(0);
        Creature rightCreature = this.rightSide.get(0);
        rightCreature.dealDamage(leftCreature);
        leftCreature.dealDamage(rightCreature);
    }

    public String makeAllMoves() {
        while (!isSomebodyWin()) {
            makeMove();
            if (!this.leftSide.get(0).isAlive()){
                leftSide.remove(0);
            }
            if (!this.rightSide.get(0).isAlive()){
                rightSide.remove(0);
            }
        }
        return whoWinn();
    }

    private boolean isLeftWin() {
        return !leftSide.isEmpty() && rightSide.isEmpty();
    }

    private boolean isRightWin() {
        return !rightSide.isEmpty() && leftSide.isEmpty();
    }

    boolean isSomebodyWin() {
        return leftSide.isEmpty() || rightSide.isEmpty();
    }

    String whoWinn() {
        if (isLeftWin()) {
            return "left side wins";
        } else if (isRightWin()) {
            return "right side wins";
        } else {
            return "nobody wins yet";
        }
    }
}

package org.example;

import org.example.heroes.Archer;
import org.example.heroes.Warrior;
import org.example.models.Creature;
import org.example.monsters.Vampire;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        archerAndWarriorAgainstTwoVampires();
    }

    private static void archerAgainstVampire(){
        Game game = new Game(new Archer(true), new Vampire(true));
        game.makeAllMoves();
    }

    private static void warriorAgainstVampire(){
        Game game = new Game(new Warrior(true), new Vampire(true));
        game.makeAllMoves();
    }

    private static void archerAndWarriorAgainstTwoVampires(){
        List<Creature> leftSideCreature = Arrays.asList(new Archer(true), new Warrior(true));
        List<Creature> rightSideCreature = Arrays.asList(new Vampire(true), new Vampire(true));
        Game game = new Game(leftSideCreature, rightSideCreature);
        game.makeAllMoves();
    }
}
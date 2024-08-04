package com.arena;

import java.util.Random;

/**
 * Represents a six-sided dice used in the Magical Arena game.
 */
public class Dice {
    private Random random;

    /**
     * Constructs a new Dice object.
     */
    public Dice(){
        this.random = new Random();
    }

    /**
     * Rolls the dice and returns the result.
     *
     * @return the result of the dice roll (a random number between 1 and 6)
     */
    public int roll(){
        return random.nextInt(6) + 1;
    }
}

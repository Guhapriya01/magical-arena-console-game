package com.arena;

/**
 * Represents a player in the Magical Arena game.
 */
public class Player {

    private int id;
    private int strength;
    private int health;
    private int attack;

    /*
     * Constructs a new Player with the specified attributes
     * 
     * @param id        a unique identifier for the player
     * @param strength  the strength of the player
     * @param health    the health of the player
     * @param attack    the attack value of the player
     */
    public Player(int id, int strength, int health, int attack) {
        this.id = id;
        this.strength = strength;
        this.health = health;
        this.attack = attack;
    }

    /**
     * Gets the ID of the player.
     *
     * @return the ID of the player
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the strength of the player.
     *
     * @return the strength of the player
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the health of the player.
     *
     * @return the health of the player
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the attack of the player.
     *
     * @return the attack of the player
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Returns a string representation of the player.
     *
     * @return a string representation of the player
     */
    @Override
    public String toString() {
        return "Player " + id;
    }

    /**
     * Reduces the health of the player by the specified amount.
     * Health cannot drop below zero.
     *
     * @param amount the amount of health to reduce
     */
    public void reduceHealth(int amount) {
        this.health = Math.max(this.health - amount, 0);
    }

    /**
     * Checks if the player is still alive.
     *
     * @return true if the player's health is greater than 0, false otherwise
     */
    public boolean isAlive() {
        return this.health > 0;
    }
}
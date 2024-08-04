package com.arena;

import java.util.Scanner;

/**
 * Represents the main game setup and execution.
 */
public class Game {

    /**
     * Creates a player by prompting the user for input.
     *
     * @return a new Player object
     */
    public static Player createPlayer(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Player Strength: ");
        int strength = sc.nextInt();

        System.out.print("Enter Player Health: ");
        int health = sc.nextInt();

        System.out.print("Enter Player Attack Power: ");
        int attack = sc.nextInt();

        System.out.println("------------------------------------------------");

        return new Player(id, strength, health, attack);
    }

     /**
     * The main method to start the game.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Magical Arena Game!\n");

        Player player1 = createPlayer();
        Player player2 = createPlayer();

        System.out.println("The battle between " + player1 + " and " + player2+ " is about to begin!\n");

        Arena arena = new Arena(player1, player2);
        arena.fight();
    }
}

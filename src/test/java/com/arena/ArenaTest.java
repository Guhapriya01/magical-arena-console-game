package com.arena;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Test class for the Arena.
 */
public class ArenaTest {

    private Player player1;
    private Player player2;
    private Arena arena;
    private Dice mockDice;

    /**
     * Sets up the test environment before each test.
     */
    @BeforeEach
    public void setUp() {
        player1 = new Player(1, 20, 150, 40);
        player2 = new Player(2, 30, 100, 70);
        arena = new Arena(player1, player2);

        // Mock the Dice to return a fixed value
        mockDice = new Dice() {
            @Override
            public int roll() {
                return 1;
            }
        };
        arena.setDice(mockDice);
    }

    /**
     * Tests the fight method to ensure it runs correctly.
     */
    @Test
    public void testFight() {
        // Ensure the fight method progresses correctly and player2 wins
        arena.fight();
        assertTrue(player2.isAlive(), "Player 2 should win");
        assertFalse(player1.isAlive(), "Player 1 should be defeated");
    }

    /**
     * Tests the performAttack method to ensure it calculates damage correctly.
     */
    @Test
    public void testPerformAttack() {
        // Calculate the expected attacker power and defender strength
        int attackerPower = player1.getAttack() * mockDice.roll();
        int defenderStrength = player2.getStrength() * mockDice.roll();

        // Calculate the damage and reduced health of the defender
        int damage = Math.max(attackerPower - defenderStrength, 0);
        int reducedHealth = player2.getHealth() - damage;

        // Perform the attack
        arena.performAttack(player1, player2);
        
        assertEquals(reducedHealth, player2.getHealth());
    }
}

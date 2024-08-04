package com.arena;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Test class for the Player.
 */
public class PlayerTest {

    private Player player;

    /**
     * Sets up a new Player object before each test method.
     */
    @BeforeEach
    public void setUp() {
        player = new Player(1, 30, 150, 40);
    }

    /*
     * Verifies that a player is created with the correct attributes.
     */
    @Test
    public void testPlayerCreation(){
        assertEquals(1, player.getId());
        assertEquals(30, player.getStrength());
        assertEquals(150, player.getHealth());
        assertEquals(40, player.getAttack());
    }   
    
    /*
     * Tests the reduction of the player's health under normal condition.
     */
    @Test
    public void testReduceHealthNormal() {
        player.reduceHealth(100);
        assertEquals(50, player.getHealth());
    }

    /*
     * Tests the reduction of the player's health to zero 
     * when it's reduced to an amount greater than its current health.
     */
    @Test
    public void testReduceHealthToZero() {
        player.reduceHealth(200);
        assertEquals(0, player.getHealth());
    }

    /*
     * Tests whether the player is alive.
     */
    @Test
    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.reduceHealth(150);
        assertFalse(player.isAlive());
    }
}

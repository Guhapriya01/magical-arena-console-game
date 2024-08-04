package com.arena;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Test class for the Dice.
 */
public class DiceTest {

    /**
     * Verifies that the result of rolling the dice falls within the expected range (1 to 6).
     */
    @Test
    public void testDiceRollInRange() {
        Dice dice = new Dice();
        int result = dice.roll();
        assertTrue(result >= 1 && result <= 6, "Dice roll result should be between 1 and 6");
    }
}

package com.arena;

/**
 * Manages fights between two players in the Magical Arena game.
 */
public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;

    /**
     * Constructs a new Arena with two players.
     *
     * @param player1 the first player
     * @param player2 the second player
     */
    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

     /**
     * Sets a custom Dice object for testing purposes.
     *
     * @param dice the Dice object to set
     */
    public void setDice(Dice dice){
        this.dice = dice;
    }

    /**
     * Initiates the fight between the two players.
     */
    public void fight() {

        // Determine the attacker and defender based on their health
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        // Continue the fight until one player is defeated
        while (attacker.isAlive() && defender.isAlive()) {
            performAttack(attacker, defender);

            if (!defender.isAlive()) {
                System.out.println(defender + " is defeated!");
                System.out.println(attacker + " wins the fight!");
                break;
            }

            // Swaps the attacker and defender for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

    /**
     * Performs an attack between the attacker and defender.
     *
     * @param attacker the attacking player
     * @param defender the defending player
     */
    public void performAttack(Player attacker, Player defender) {
        
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        // Calculate attacker's power and defender's strength
        int attackerPower = attackRoll * attacker.getAttack();
        int defenderStrength = defendRoll * defender.getStrength();

        int damage = attackerPower - defenderStrength;
        
        displayAttackDetails(attacker, defender, attackerPower, defenderStrength);

        if (damage > 0) {
            defender.reduceHealth(damage);
            System.out.println(attacker + " causes " + damage + " damage to " + defender + ".");
        } else {
            System.out.println(defender + " defends successfully.");
        }

        System.out.println(defender + " has " + defender.getHealth() + " health left.");
        System.out.println("------------------------------------------------\n");
    }

    /**
     * Displays the details of the attack.
     *
     * @param attacker the attacking player
     * @param defender the defending player
     * @param attackerPower the attacker's power
     * @param defenderStrength the defender's strength
     */
    private void displayAttackDetails(Player attacker, Player defender, int attackerPower, int defenderStrength) {
        System.out.println(attacker + " attacks with power " + attackerPower + ".");
        System.out.println(defender + " defends with strength " + defenderStrength + ".\n");
    }
}

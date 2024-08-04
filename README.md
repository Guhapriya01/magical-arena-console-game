# The Magical Arena 

## Overview
This project implements a Magical Arena game where players engage in battles. Each player has attributes such as health, strength, and attack, and they take turns attacking each other until one player's health reaches zero.

## Project Structure

```
Magical Arena
├─ lib
│  └─ junit-platform-console-standalone-1.11.0-M2.jar
└─ src
   ├─ main
   │  └─ java
   │     └─ com
   │        └─ arena
   │           ├─ Arena.java
   │           ├─ Dice.java
   │           ├─ Game.java
   │           └─ Player.java
   └─ test
      └─ java
         └─ com
            └─ arena
               ├─ ArenaTest.java
               ├─ DiceTest.java
               └─ PlayerTest.java

```

## Dependencies
- Java Development Kit (JDK) 8 or higher
- JUnit (included in the `lib` folder)

## Instructions

### Running the Game
1. **Extract the Project Folder**: Unzip the project folder to your desired location.
2. **Open the Project**: Navigate to the unzipped folder and open it in your preferred Integrated Development Environment (IDE).
3. **Run the Main Class**: Locate the Main class (`Game.java`) in the path `.src/main/java/com/game/` and execute it to start the game simulation.

### Running Unit Tests
1. **Ensure JUnit JAR is Present**: Make sure that the JUnit JAR file is present inside the `lib` folder.
2. **Run the Test Classes**: Execute the test classes (`ArenaTest`, `DiceTest` and `PlayerTest`) to verify the correctness of the implemented functionalities.


## Class Details

### Arena
- **Description**: Manages fights between two players in the Magical Arena game.
- **Attributes**:
  - `player1`: First player in the arena.
  - `player2`: Second player in the arena.
  - `dice`: Dice object used for rolling in the arena.
- **Methods**:
  - `fight()`: Initiates the fight between the two players.
  - `performAttack(Player attacker, Player defender)`: Performs an attack between the attacker and defender.
  - `setDice(Dice dice)`: Sets a custom Dice object for testing purposes.
  - `displayAttackDetails(Player attacker, Player defender, int attackerPower, int defenderStrength)`: Displays the details of the attack.

### Dice
- **Description**: Represents a six-sided dice used in the Magical Arena game.
- **Attributes**:
  - `random`: Random object for generating random numbers.
- **Methods**:
  - `roll()`: Rolls the dice and returns the result.

### Player
- **Description**: Represents a player in the Magical Arena game.
- **Attributes**:
  - `id`: Unique identifier for the player.
  - `strength`: Strength attribute of the player.
  - `health`: Health attribute of the player.
  - `attack`: Attack attribute of the player.
- **Methods**:
  - `Player(int id, int strength, int health, int attack)`: Constructor to initialize the player attributes.
  - `getId()`: Returns the ID of the player.
  - `getStrength()`: Returns the strength of the player.
  - `getHealth()`: Returns the health of the player.
  - `getAttack()`: Returns the attack of the player.
  - `reduceHealth(int amount)`: Reduces the health of the player by the specified amount.
  - `isAlive()`: Checks if the player is still alive.
  - `toString()`: Returns a string representation of the player.

### Game
- **Description**: Represents the main game setup and execution.
- **Methods**:
  - `createPlayer()`: Creates a player by prompting the user for input.
  - `main(String[] args)`: The main method to start the game.


# Unit Tests

### DiceTest
- **Description**: Test class for the Dice class.
- **Test Methods**:
  - `testDiceRollInRange()`: Verifies that the result of rolling the dice falls within the expected range (1 to 6).

### ArenaTest
- **Description**: Test class for the Arena class.
- **Setup**: Sets up the test environment before each test.
- **Test Methods**:
  - `testFight()`: Tests the fight method to ensure it runs correctly.
  - `testPerformAttack()`: Tests the performAttack method to ensure it calculates damage correctly.

### PlayerTest
- **Description**: Test class for the Player class.
- **Setup**: Sets up a new Player object before each test method.
- **Test Methods**:
  - `testPlayerCreation()`: Verifies that a player is created with the correct attributes.
  - `testReduceHealthNormal()`: Tests the reduction of the player's health under normal condition.
  - `testReduceHealthToZero()`: Tests the reduction of the player's health to zero when it's reduced to an amount greater than its current health.
  - `testIsAlive()`: Tests whether the player is alive.

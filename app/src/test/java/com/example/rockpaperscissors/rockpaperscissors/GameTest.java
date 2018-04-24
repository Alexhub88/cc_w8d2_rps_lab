package com.example.rockpaperscissors.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void before(){
        game = new Game("rock", "scissors");
    }

    @Test
    public void gameHasPlayerChoice(){
        assertEquals("rock", game.getPlayerGuess());
    }

    @Test
    public void gameHasComputerChoice(){
        assertEquals("scissors", game.getComputerGuess());
    }

    @Test
    public void canDecideWinner(){
        assertEquals("You win by playing rock", game.decideWinner());
    }
}

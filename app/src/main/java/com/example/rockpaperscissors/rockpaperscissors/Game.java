package com.example.rockpaperscissors.rockpaperscissors;

import java.util.HashMap;

public class Game {

    private String playerGuess;
    private String computerGuess;
    private HashMap<String, String> win;

    public Game(String playerGuess, String computerGuess) {
        this.playerGuess = playerGuess;
        this.computerGuess = computerGuess;

        this.win = new HashMap();
        win.put("rock", "scissors");
        win.put("scissors", "paper");
        win.put("paper", "rock");
    }

    public String getPlayerGuess() {
        return playerGuess;
    }

    public String getComputerGuess() {
        return computerGuess;
    }

    public String decideWinner() {
        String result = "";
        if ((win.get(playerGuess)).equals(computerGuess)) {
            result = "You win by playing " + playerGuess;
        } else if ((playerGuess).equals(computerGuess)) {
            result = "It's a draw!";
        } else {
            result = "Computer wins by playing " + computerGuess;
        }

        return result;
    }




}
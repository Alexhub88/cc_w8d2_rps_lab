package com.example.rockpaperscissors.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPSActivity extends AppCompatActivity {

    private String rules;
    private TextView rulesTextView;
    private TextView computerChoiceTextView;
    private TextView resultTextView;
    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        rulesTextView = findViewById(R.id.rulesTextViewID);
        computerChoiceTextView = findViewById(R.id.computerChoiceTextViewID);
        resultTextView = findViewById(R.id.resultTextViewID);
        rockButton = findViewById(R.id.rockButtonID);
        paperButton = findViewById(R.id.paperButtonID);
        scissorsButton = findViewById(R.id.scissorsButtonID);

        rules = "Choose one button (Rock, Paper or Scissors) and click on it." +
                "The Computer will make a random guess of Rock, Paper or Scissors." +
                "The results will then be compared, and the winner displayed below.";
        rulesTextView.setText(rules);

    }

    public void onRockButtonClicked(View button) {
        Computer computer = new Computer();
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        Game game = new Game("rock", computerGuess);
        resultTextView.setText(game.decideWinner());
    }

    public void onPaperButtonClicked(View button) {
        Computer computer = new Computer();
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        Game game = new Game("paper", computerGuess);
        resultTextView.setText(game.decideWinner());
    }

    public void onScissorsButtonClicked(View button) {
        Computer computer = new Computer();
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        Game game = new Game("scissors", computerGuess);
        resultTextView.setText(game.decideWinner());
    }


}


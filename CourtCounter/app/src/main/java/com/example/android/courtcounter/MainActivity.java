package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**this method is for updating value to three when +3 Points button is clicked
     *
     */
    public void threepointA(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    /**this method is for updating value to two when +2 Points button is clicked
     *
     */
    public void twopointA(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    /**this method is for updating value to one when freethrow button is clicked
     *
     */
    public void freethrowA(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int i) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(i));
    }


    /**this method is for updating value to three when +3 Points button is clicked
     *
     */
    public void threepointB(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    /**this method is for updating value to two when +2 Points button is clicked
     *
     */
    public void twopointB(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    /**this method is for updating value to one when freethrow button is clicked
     *
     */
    public void freethrowB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int i) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
        scoreView.setText(String.valueOf(i));
    }

    public void  Resetscreen(View view){
        displayForTeamA(0);
        displayForTeamB(0);
    }
}

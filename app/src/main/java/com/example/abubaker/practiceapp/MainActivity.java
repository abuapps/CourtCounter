package com.example.abubaker.practiceapp;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
       // displayForTeamB(0);

    }



    public void displayForTeamA(int score)
    {
        TextView textView = (TextView) findViewById(R.id.showText);

        textView.setText(String.valueOf(score));

    }

    public  void displayForTeamB(int score)
    {
        TextView textView = (TextView) findViewById(R.id.showText1);

        textView.setText(String.valueOf(score));
}



    public void forThreePointA(View v)
    {
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);


    }

    public void forTwoPointA(View v)
    {
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);

    }

    public void forThrowPointA(View v)
    {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }



    public void forThreePointB(View v)
    {
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);

    }



    public void forTwoPointB(View v)
    {
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);

    }



    public void forFreePointB(View v)
    {
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);

    }

    public void onReset(View view) {

        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);

    }
}

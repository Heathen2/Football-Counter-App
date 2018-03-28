package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreAway = 0;
    int foulHome = 0;
    int foulAway = 0;
    int bookingHome = 0;
    int bookingAway = 0;
    int shotHome = 0;
    int shotAway = 0;
    int ontargetHome = 0;
    int ontargetAway = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalHome(View view) {
        scoreHome += 1;
        displayGoalHome(scoreHome);
    }

    public void foulByHome(View view) {
        foulHome += 1;
        displayFoulHome(foulHome);
    }

    public void bookingByHome(View view) {
        bookingHome += 1;
        displayBookingHome(bookingHome);

    }

    public void shotsByHome(View view) {
        shotHome += 1;
        displayShotHome(shotHome);

    }

    public void ontargetByHome(View view) {
        ontargetHome += 1;
        displayontargetHome(ontargetHome);

    }



    public void displayGoalHome(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_a_score);
        goalView.setText(String.valueOf(goal));
    }

    public void displayFoulHome(int foul) {
        TextView foulView = (TextView) findViewById(R.id.home_fouls);
        foulView.setText(String.valueOf(foul));
    }

    public void displayBookingHome(int booking) {
        TextView foulView = (TextView) findViewById(R.id.home_bookings);
        foulView.setText(String.valueOf(booking));
    }

    public void displayShotHome(int shot) {
        TextView shotView = (TextView) findViewById(R.id.home_shots);
        shotView.setText(String.valueOf(shot));
    }

    public void displayontargetHome(int ontarget) {
        TextView ontargetView = (TextView) findViewById(R.id.home_ontarg);
        ontargetView.setText(String.valueOf(ontarget));
    }

    public void goalAway(View view) {
        scoreAway += 1;
        displayGoalAway(scoreAway);
    }

    public void foulByAway(View view) {
        foulAway += 1;
        displayFoulAway(foulAway);
    }

    public void bookingByAway(View view) {
        bookingAway += 1;
        displayBookingAway(bookingAway);


    }

    public void shotsByAway(View view) {
        shotAway += 1;
        displayShotAway(shotAway);

    }

    public void ontargetByAway(View view) {
        ontargetAway += 1;
        displayontargetAway(ontargetAway);

    }

    public void displayGoalAway(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_b_score);
        goalView.setText(String.valueOf(goal));
    }



    public void displayFoulAway(int foul) {
        TextView foulView = (TextView) findViewById(R.id.away_fouls);
        foulView.setText(String.valueOf(foul));
    }

    public void displayBookingAway(int booking) {
        TextView foulView = (TextView) findViewById(R.id.away_bookings);
        foulView.setText(String.valueOf(booking));
    }

    public void displayShotAway(int shot) {
        TextView shotView = (TextView) findViewById(R.id.away_shots);
        shotView.setText(String.valueOf(shot));
    }

    public void displayontargetAway(int ontarget) {
        TextView ontargetView = (TextView) findViewById(R.id.away_ontarg);
        ontargetView.setText(String.valueOf(ontarget));
    }

    public void resetScore  (View view) {
        scoreHome = 0;
        scoreAway = 0;
        foulHome = 0;
        foulAway = 0;
        bookingAway = 0;
        bookingHome = 0;
        shotHome = 0;
        shotAway = 0;
        ontargetHome = 0;
        ontargetAway = 0;
        displayGoalHome(scoreHome);
        displayFoulHome(foulHome);
        displayGoalAway(scoreAway);
        displayFoulAway(foulAway);
        displayBookingHome(bookingHome);
        displayBookingAway(bookingAway);
        displayShotHome(shotHome);
        displayShotAway(shotAway);
        displayontargetHome(ontargetHome);
        displayontargetAway(ontargetAway);
    }


}

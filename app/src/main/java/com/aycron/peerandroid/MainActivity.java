package com.aycron.peerandroid;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar firstBar = null;
    private int length_in_milliseconds = 3000;
    private int period_in_milliseconds = 1000;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        firstBar = (ProgressBar)findViewById(R.id.firstBar);

        CountDownTimer countDownTimer = new CountDownTimer(length_in_milliseconds,period_in_milliseconds) {
            private boolean warned = false;
            @Override
            public void onTick(long millisUntilFinished_) {
                i++;
                firstBar.setProgress(i);
            }

            @Override
            public void onFinish() {
                i++;
                firstBar.setProgress(i);
                //Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
                Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(myIntent);

            }
        }.start();

    }
}

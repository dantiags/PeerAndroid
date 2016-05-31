package com.aycron.peerandroid;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar firstBar = null;
    private int length_in_milliseconds = 10000;
    private int period_in_milliseconds = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBar = (ProgressBar)findViewById(R.id.firstBar);
        firstBar.setMax(10);

        CountDownTimer countDownTimer = new CountDownTimer(length_in_milliseconds,period_in_milliseconds) {
            private boolean warned = false;
            @Override
            public void onTick(long millisUntilFinished_) {
                firstBar.setProgress((int)((length_in_milliseconds-millisUntilFinished_)/length_in_milliseconds*100.0));
            }

            @Override
            public void onFinish() {
                Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        }.start();

    }
}

package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.ImageButton;

public class MessagesActivity extends AppCompatActivity  implements OnClickListener{

    ImageButton resultsButton;
    ImageButton mapsButton;
    ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);

        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);
        menuButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                Intent intentResults = new Intent(MessagesActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(MessagesActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;
            case R.id.imgMenuMenu:
                break;

        }
    }
}

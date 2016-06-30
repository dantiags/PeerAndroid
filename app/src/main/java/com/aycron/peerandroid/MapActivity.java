package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MapActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton resultsButton;
    ImageButton messagesButton;
    ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);

        resultsButton.setOnClickListener(this);
        messagesButton.setOnClickListener(this);
        menuButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                Intent intentResults = new Intent(MapActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.imgMenuMap:

                break;
            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(MapActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;
            case R.id.imgMenuMenu:
                break;

        }
    }
}

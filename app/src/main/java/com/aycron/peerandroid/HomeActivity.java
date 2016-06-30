package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity  implements OnClickListener{

    ImageButton resultsButton;
    ImageButton mapsButton;
    ImageButton messagesButton;
    ImageButton menuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);

        resultsButton.setOnClickListener(this);
        mapsButton.setOnClickListener(this);
        messagesButton.setOnClickListener(this);
        menuButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                break;
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(HomeActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;
            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(HomeActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;
            case R.id.imgMenuMenu:
                break;

        }
    }
}

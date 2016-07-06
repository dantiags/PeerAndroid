package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Match2Activity extends BaseMenuActivity implements View.OnClickListener {

    ImageButton resultsButton;
    ImageButton mapsButton;
    ImageButton messagesButton;
    ImageButton menuButton;
    ImageButton yesButton;
    ImageButton noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match2);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        yesButton = (ImageButton) findViewById(R.id.imageYes);
        noButton = (ImageButton) findViewById(R.id.imageNo);


        mapsButton.setOnClickListener(this);
        messagesButton.setOnClickListener(this);
        yesButton.setOnClickListener(this);
        noButton.setOnClickListener(this);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Match2Activity.this, view);
                popupMenu.setOnMenuItemClickListener(Match2Activity.this);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(Match2Activity.this, MapActivity.class);
                startActivity(intentMap);
                break;

            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(Match2Activity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;

            case R.id.imageYes:
                Intent intentNextMatchYes = new Intent(Match2Activity.this, HomeActivity.class);
                startActivity(intentNextMatchYes);
                break;

            case R.id.imageNo:
                Intent intentNextMatchNo = new Intent(Match2Activity.this, HomeActivity.class);
                startActivity(intentNextMatchNo);
                break;
        }
    }
}

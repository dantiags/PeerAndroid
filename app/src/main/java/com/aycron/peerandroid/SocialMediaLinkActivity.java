package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.widget.ImageButton;

public class SocialMediaLinkActivity extends BaseMenuActivity  implements View.OnClickListener{

    ImageButton mapsButton;
    ImageButton messagesButton;
    ImageButton menuButton;
    ImageButton resultsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_link);

        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);

        menuButton.setImageResource(R.drawable.menumenu);

        messagesButton.setOnClickListener(this);
        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(SocialMediaLinkActivity.this, view);
                popupMenu.setOnMenuItemClickListener(SocialMediaLinkActivity.this);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                Intent intentResults = new Intent(SocialMediaLinkActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(SocialMediaLinkActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(SocialMediaLinkActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;
        }
    }
}

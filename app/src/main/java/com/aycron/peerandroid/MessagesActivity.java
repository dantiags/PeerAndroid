package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.view.View.*;
import android.widget.ImageButton;

public class MessagesActivity extends BaseMenuActivity  implements OnClickListener{

    ImageButton resultsButton;
    ImageButton mapsButton;
    ImageButton menuButton;
    ImageButton messagesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);
        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);

        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MessagesActivity.this, view);
                popupMenu.setOnMenuItemClickListener(MessagesActivity.this);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
            }
        });

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

        }
    }
}

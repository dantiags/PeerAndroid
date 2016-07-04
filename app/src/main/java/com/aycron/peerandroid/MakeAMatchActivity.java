package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

public class MakeAMatchActivity extends BaseMenuActivity  implements View.OnClickListener {

    ImageButton mapsButton;
    ImageButton messagesButton;
    ImageButton menuButton;
    ImageButton resultsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_amatch);

        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        menuButton = (ImageButton) findViewById(R.id.imgMenuMenu);

        messagesButton.setOnClickListener(this);
        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);

        menuButton.setImageResource(R.drawable.menumenu);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MakeAMatchActivity.this, view, Gravity.CENTER);
                popupMenu.setOnMenuItemClickListener(MakeAMatchActivity.this);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                Intent intentResults = new Intent(MakeAMatchActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(MakeAMatchActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(MakeAMatchActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;
        }
    }
}

package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends BaseMenuActivity  implements View.OnClickListener{

    Button btnSearch;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);


        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);

        btnSearch = (Button) findViewById(R.id.btnProfileSearchSettings);
        btnSave = (Button) findViewById(R.id.btnProfileSave);

        messagesButton.setOnClickListener(this);
        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
        btnSave.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                Intent intentResults = new Intent(ProfileActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(ProfileActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(ProfileActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;
            case R.id.btnProfileSearchSettings:
                Intent intentQuickSearch = new Intent(ProfileActivity.this, QuickSearchActivity.class);
                startActivity(intentQuickSearch);
                break;
            case R.id.btnProfileSave:
                Toast.makeText(this, "Profile Saved!!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}

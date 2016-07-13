package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class QuickSearchActivity extends BaseMenuActivity implements View.OnClickListener {

    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_search);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        profileButton = (ImageButton) findViewById(R.id.imgMenuProfile);

        searchButton = (Button) findViewById(R.id.btnSearch);

        messagesButton.setOnClickListener(this);
        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);
        searchButton.setOnClickListener(this);

        Spinner spinnerSearchArea = (Spinner) findViewById(R.id.spinnerSearchArea);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.search_area, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerSearchArea.setAdapter(adapter);

        Spinner spinnerRelationShipStatus = (Spinner) findViewById(R.id.spinnerRelationshipStatus);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterRS = ArrayAdapter.createFromResource(this, R.array.relationship_status, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterRS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerRelationShipStatus.setAdapter(adapterRS);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuResults:
                Intent intentResults = new Intent(QuickSearchActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(QuickSearchActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(QuickSearchActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;
            case R.id.imgMenuProfile:
                Intent intentProfile = new Intent(QuickSearchActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
                break;
            case R.id.btnSearch:
                Intent makeAMatch = new Intent(QuickSearchActivity.this, MakeAMatchActivity.class);
                startActivity(makeAMatch);
                break;
        }
    }
}

package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.aycron.peerandroid.exceptions.ExceptionHandler;

public class BaseMenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    ImageButton mapsButton;
    ImageButton messagesButton;
    ImageButton profileButton;
    ImageButton resultsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.miMenu:
                View menuItem = findViewById(R.id.miMenu);
                PopupMenu popupMenu = new PopupMenu(BaseMenuActivity.this, menuItem);
                popupMenu.setOnMenuItemClickListener(BaseMenuActivity.this);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
                break;
            default:
                Toast.makeText(this, item.getItemId() + " Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_profile:
                Intent intentProfile = new Intent(BaseMenuActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
                break;
            case R.id.item_results:
                Intent intentResults = new Intent(BaseMenuActivity.this, HomeActivity.class);
                startActivity(intentResults);
                break;
            case R.id.item_quicksearch:
                Intent quickSearchIntent = new Intent(BaseMenuActivity.this, QuickSearchActivity.class);
                startActivity(quickSearchIntent);
                break;
            case R.id.item_match:
                Intent intentMatch = new Intent(BaseMenuActivity.this, MakeAMatchActivity.class);
                startActivity(intentMatch);
                break;
            case R.id.item_rate:
                Toast.makeText(this, "Rate Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_tell:
                Toast.makeText(this, "Tell A Friend Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_social:
                Intent socialIntent = new Intent(BaseMenuActivity.this, SocialMediaLinkActivity.class);
                startActivity(socialIntent);
                break;
            case R.id.item_notification:
                Intent notificationIntent = new Intent(BaseMenuActivity.this, NotificationSettingsActivity.class);
                startActivity(notificationIntent);
                break;
        }
        return true;
    }

}

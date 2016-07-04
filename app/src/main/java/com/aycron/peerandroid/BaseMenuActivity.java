package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.Toast;

import com.aycron.peerandroid.exceptions.ExceptionHandler;

public class BaseMenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
    }


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

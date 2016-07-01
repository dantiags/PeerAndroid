package com.aycron.peerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseMenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_profile:
                Toast.makeText(this, "Comedy Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_results:
                Toast.makeText(this, "Movies Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_quicksearch:
                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_match:
                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_rate:
                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_tell:
                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_social:
                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_notification:
                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

}

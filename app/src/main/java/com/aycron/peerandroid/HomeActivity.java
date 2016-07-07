package com.aycron.peerandroid;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends BaseMenuActivity  implements OnClickListener {

    ImageButton yesButton;
    ImageButton noButton;
    ImageButton matchImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        profileButton = (ImageButton) findViewById(R.id.imgMenuProfile);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        matchImage = (ImageButton) findViewById(R.id.imgMainPicture);
        yesButton = (ImageButton) findViewById(R.id.imageYes);
        noButton = (ImageButton) findViewById(R.id.imageNo);

        mapsButton.setOnClickListener(this);
        messagesButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);
        yesButton.setOnClickListener(this);
        noButton.setOnClickListener(this);
        matchImage.setOnClickListener(this);

        matchImage.setTag(R.drawable.match_photo1);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgMenuMap:
                Intent intentMap = new Intent(HomeActivity.this, MapActivity.class);
                startActivity(intentMap);
                break;

            case R.id.imgMenuMessages:
                Intent intentMessages = new Intent(HomeActivity.this, MessagesActivity.class);
                startActivity(intentMessages);
                break;

            case R.id.imgMenuProfile:
                Intent intentProfile = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
                break;

            case R.id.imageYes:
                changeMatchPicture((Integer)matchImage.getTag());
                break;
            case R.id.imageNo:
                changeMatchPicture((Integer)matchImage.getTag());
                break;
            case R.id.imgMainPicture:
                changeDetailsPicture((Integer)matchImage.getTag());
                break;
        }
    }

    private void changeMatchPicture(Integer resource){
        if (resource == R.drawable.match_photo1 || resource == R.drawable.match_photo1_details){
            matchImage.setImageResource(R.drawable.match_photo2);
            matchImage.setTag(R.drawable.match_photo2);
        }else  {
            matchImage.setImageResource(R.drawable.match_photo1);
            matchImage.setTag(R.drawable.match_photo1);
        }
    }

    private void changeDetailsPicture(Integer resource){
        if (resource == R.drawable.match_photo1){
            matchImage.setImageResource(R.drawable.match_photo1_details);
            matchImage.setTag(R.drawable.match_photo1_details);
        }else  {
            matchImage.setImageResource(R.drawable.match_photo1);
            matchImage.setTag(R.drawable.match_photo1);
        }
    }
}

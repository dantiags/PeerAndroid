package com.aycron.peerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.*;
import android.widget.ImageButton;
import android.widget.ListView;

import com.aycron.peerandroid.model.Message;
import com.aycron.peerandroid.model.MessagesAdapter;

public class MessagesActivity extends BaseMenuActivity  implements OnClickListener{

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        messagesButton = (ImageButton) findViewById(R.id.imgMenuMessages);
        mapsButton = (ImageButton) findViewById(R.id.imgMenuMap);
        resultsButton = (ImageButton) findViewById(R.id.imgMenuResults);
        profileButton = (ImageButton) findViewById(R.id.imgMenuProfile);

        messagesButton.setOnClickListener(this);
        mapsButton.setOnClickListener(this);
        resultsButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);

        Message messages[] = new Message[]{
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
                new Message(R.mipmap.ic_launcher, "Hello! How are you?"),
        };

        MessagesAdapter adapter = new MessagesAdapter(this, R.layout.listview_item_row, messages);
        lv = (ListView) this.findViewById(R.id.lvMessages);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);
        lv.addHeaderView(header);
        lv.setAdapter(adapter);


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
            case R.id.imgMenuProfile:
                Intent intentProfile = new Intent(MessagesActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
                break;

        }
    }
}

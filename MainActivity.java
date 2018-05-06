package com.example.android.imusicplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the playlist category
        TextView playlist = (TextView) findViewById(R.id.playlists);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, playlistActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView newsongs = (TextView) findViewById(R.id.newSongs);
        newsongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent newsongsIntent = new Intent(MainActivity.this, newSongsActivity.class);
                startActivity(newsongsIntent);
            }
        });

        TextView likedSongs = (TextView) findViewById(R.id.likedSongs);
        likedSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent likedSongsIntent = new Intent(MainActivity.this, likedSongsAtivity.class);
                startActivity(likedSongsIntent);
            }
        });

        TextView stations = (TextView) findViewById(R.id.staion);
        stations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent stationsIntent = new Intent(MainActivity.this, stationsActivity.class);
                startActivity(stationsIntent);
            }
        });
    }
}
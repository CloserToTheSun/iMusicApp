package com.example.android.imusicplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class playlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<song> songs = new ArrayList<song>();
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));
        songs.add(new song("The Sky is Blue", "Nabil Furmoli", R.drawable.music_icon));

        songAdapter listAdapter = new songAdapter(this, songs);
        ListView song_list = (ListView) findViewById(R.id.songList);
        song_list.setAdapter(listAdapter);

        Button home_button = (Button) findViewById(R.id.Home_button);
        // Set a click listener on that View
        home_button.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent home_Intent = new Intent(playlistActivity.this, MainActivity.class);
                startActivity(home_Intent);
            }
        });

    }
}
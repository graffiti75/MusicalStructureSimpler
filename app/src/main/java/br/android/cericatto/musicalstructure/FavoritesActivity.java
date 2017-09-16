package br.android.cericatto.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Button home = (Button) findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(FavoritesActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Button search = (Button) findViewById(R.id.search_btn);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(FavoritesActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        Button nowPlaying = (Button) findViewById(R.id.now_playing_btn);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(FavoritesActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        Button store = (Button) findViewById(R.id.store_btn);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(FavoritesActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });
    }
}
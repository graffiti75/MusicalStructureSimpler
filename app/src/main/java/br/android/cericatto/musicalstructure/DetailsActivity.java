package br.android.cericatto.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button home = (Button) findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(DetailsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Button nowPlaying = (Button) findViewById(R.id.now_playing_btn);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(DetailsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        Button favorites = (Button) findViewById(R.id.favorites_btn);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favoritesIntent = new Intent(DetailsActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

        Button store = (Button) findViewById(R.id.store_btn);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(DetailsActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });
    }
}
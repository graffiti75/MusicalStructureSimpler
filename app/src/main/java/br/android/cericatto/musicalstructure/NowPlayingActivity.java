package br.android.cericatto.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button home = (Button) findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Button search = (Button) findViewById(R.id.search_btn);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(NowPlayingActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        Button favorites = (Button) findViewById(R.id.favorites_btn);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favoritesIntent = new Intent(NowPlayingActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

        Button store = (Button) findViewById(R.id.store_btn);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(NowPlayingActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });
    }
}
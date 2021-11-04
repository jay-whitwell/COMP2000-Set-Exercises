package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CachesFoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caches_found);

        Intent intent = getIntent();
        String cacheName = intent.getStringExtra(CachesFoundListActivity.EXTRA_MESSAGE);
        TextView title = findViewById(R.id.cacheFoundTitle);

        title.setText(cacheName);
    }
}
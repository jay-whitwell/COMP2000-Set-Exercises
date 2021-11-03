package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageCacheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_cache);

        Button createCacheButton = findViewById(R.id.manageCreateCacheButton);
        Button viewCachesButton = findViewById(R.id.manageViewCachesButton);

        createCacheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createCache();
            }
        });

        viewCachesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewCaches();
            }
        });

    }

    public void createCache()
    {
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }

    public void viewCaches()
    {
        Intent intent = new Intent(this, YourCachesActivity.class);
        startActivity(intent);
    }
}
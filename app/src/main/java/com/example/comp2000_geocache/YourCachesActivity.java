package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YourCachesActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.comp2000_geocache.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_caches);

        Button cacheButton1 = findViewById(R.id.cacheButton1);
        Button cacheButton2 = findViewById(R.id.cacheButton2);
        Button cacheButton3 = findViewById(R.id.cacheButton3);
        Button cacheButton4 = findViewById(R.id.cacheButton4);

        cacheButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inPlay("Cache 1");
            }
        });

        cacheButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inPlay("Cache 2");
            }
        });

        cacheButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maintenace("Cache 3");
            }
        });

        cacheButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                damaged("Cache 4");
            }
        });
    }

    public void inPlay(String name)
    {
        Intent intent = new Intent(this, CacheInPlayActivity.class);

        // Create the example list so we don't need to create 4 different pages
        String[] cacheDetails = new String[] { name, "Yes", "15", "5", "No"};

        intent.putExtra(EXTRA_MESSAGE, cacheDetails);
        startActivity(intent);
    }

    public void damaged(String name)
    {
        Intent intent = new Intent(this, CacheInPlayActivity.class);
        String[] cacheDetails = new String[] { name, "No", "13", "7", "Yes" };
        intent.putExtra(EXTRA_MESSAGE, cacheDetails);
        startActivity(intent);
    }

    public void maintenace(String name)
    {
        Intent intent = new Intent(this, CacheInPlayActivity.class);
        String[] cacheDetails = new String[] { name, "No", "20", "0", "No" };

        intent.putExtra(EXTRA_MESSAGE, cacheDetails);
        startActivity(intent);
    }

}
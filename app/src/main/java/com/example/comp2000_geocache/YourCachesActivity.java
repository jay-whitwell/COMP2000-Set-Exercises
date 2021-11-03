package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YourCachesActivity extends AppCompatActivity {

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
                details();
            }
        });

        cacheButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                details();
            }
        });

        cacheButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                details();
            }
        });

        cacheButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                details();
            }
        });
    }

    public void details()
    {
        Intent intent = new Intent(this, YourCacheDetailsActivity.class);
        startActivity(intent);
    }

}
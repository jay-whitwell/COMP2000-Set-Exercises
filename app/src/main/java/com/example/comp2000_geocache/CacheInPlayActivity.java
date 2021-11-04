package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CacheInPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache_in_play);

        // Get the list
        Intent intent = getIntent();
        String[] cacheDetails = intent.getStringArrayExtra(YourCachesActivity.EXTRA_MESSAGE);

        // Get the TextViews to change the details
        TextView title = findViewById(R.id.inPlayTitle);
        TextView inPlay = findViewById(R.id.isInPlay);
        TextView timesFound = findViewById(R.id.timesFound);
        TextView untilMaintenance = findViewById(R.id.untilMaintenance);
        TextView isDamaged = findViewById(R.id.isDamaged);

        title.setText(cacheDetails[0]);
        inPlay.setText(cacheDetails[1]);
        timesFound.setText(cacheDetails[2]);
        untilMaintenance.setText(cacheDetails[3]);
        isDamaged.setText(cacheDetails[4]);


    }
}
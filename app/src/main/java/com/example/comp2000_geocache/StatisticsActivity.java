package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);


        Button manageCacheButton = findViewById(R.id.statisticsManageCaches);
        Button cachesFoundButton = findViewById(R.id.statisticsCachesFound);
        Button cachesCreatedButton = findViewById(R.id.statisticsCachesCreated);


        manageCacheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCaches();
            }
        });

    }

    public void manageCaches()
    {
        Intent intent = new Intent(this, ManageCacheActivity.class);
        startActivity(intent);
    }

}
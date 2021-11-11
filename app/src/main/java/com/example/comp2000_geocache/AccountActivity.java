package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        Intent intent = getIntent();
        String username = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        TextView accountUsername = findViewById(R.id.usernameDisplay);
        accountUsername.setText(username);

        Button accountMapButton = findViewById(R.id.accountMapButton);
        Button accountStatisticsButton = findViewById(R.id.accountStatisticsButton);
        Button accountManageCachesButton = findViewById(R.id.accountManageCaches);

        accountMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map();
            }
        });

        accountStatisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statistics();
            }
        });

        accountManageCachesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCache();
            }
        });
    }

    public void map()
    {
        Intent intent = new Intent(this, MapActivity.class);

        startActivity(intent);
    }

    public void statistics()
    {
        Intent intent = new Intent(this, StatisticsActivity.class);

        startActivity(intent);
    }

    public void manageCache()
    {
        Intent intent = new Intent(this, ManageCacheActivity.class);

        startActivity(intent);
    }
}
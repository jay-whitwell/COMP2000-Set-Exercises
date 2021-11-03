package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button viewItemButton = findViewById(R.id.mapViewItem);

        viewItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewItem();
            }
        });
    }

    public void viewItem()
    {
        Intent intent = new Intent(this, ViewItemActivity.class);

        startActivity(intent);
    }
}
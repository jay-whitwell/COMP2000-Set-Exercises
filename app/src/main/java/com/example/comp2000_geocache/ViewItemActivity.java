package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Map;

public class ViewItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

        // Create the hint Toast
        Toast toast = Toast.makeText(getApplicationContext(), "Hint Example", Toast.LENGTH_LONG);

        Button navigateToButton = findViewById(R.id.viewNavigateTo);
        Button hintButton = findViewById(R.id.viewShowHint);

        navigateToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTo();
            }
        });

        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // toast.cancel() before .show() stops the hint bugging out and lingering too
                // long on the screen
                toast.cancel();
                toast.show();
            }
        });
    }

    public void navigateTo()
    {
        Intent intent = new Intent(this, MapActivity.class);

        startActivity(intent);
    }
}
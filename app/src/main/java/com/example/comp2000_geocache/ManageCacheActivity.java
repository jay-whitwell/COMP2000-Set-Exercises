package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ManageCacheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_cache);

        Button createCacheButton = findViewById(R.id.manageCreateCacheButton);
        Button viewCachesButton = findViewById(R.id.manageViewCachesButton);

        createCacheButton.setOnClickListener(view -> createCache());

        viewCachesButton.setOnClickListener(view -> viewCaches());
    }

    public void createCache()
    {
        Intent intent = new Intent(this, YourCachesActivity.class);

        // Get the EditText Values
        EditText createName = findViewById(R.id.createName);
        EditText createDescription = findViewById(R.id.createDescription);
        EditText createLocation = findViewById(R.id.createLocation);
        EditText createHint = findViewById(R.id.createHint);

        String name = createName.getText().toString();
        String description = createDescription.getText().toString();
        String location = createLocation.getText().toString();
        String hint = createHint.getText().toString();

        // Show the errors if fields are empty
        if (TextUtils.isEmpty(name)) { createName.setError("Please enter a name"); }
        else if (TextUtils.isEmpty(description)) { createDescription.setError("Please enter a username"); }
        else if (TextUtils.isEmpty(location)) { createLocation.setError("Please enter a password"); }
        else if (TextUtils.isEmpty(hint)) { createHint.setError("Please enter a password"); }
        else { startActivity(intent); }
    }

    public void viewCaches()
    {
        Intent intent = new Intent(this, YourCachesActivity.class);
        startActivity(intent);
    }
}
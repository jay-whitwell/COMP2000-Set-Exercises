package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button ID
        Button signUpButton = findViewById(R.id.signupButton);
        Button logInButton = findViewById(R.id.homeLoginButton);

        // Create the onClick to change activity
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login()
    {
        // Create the intent to open the log in page
        Intent intent = new Intent(this, LoginActivity.class);

        startActivity(intent);
    }

    public void signup()
    {
        // Create the intent to open the sign up page
        Intent intent = new Intent(this, SignupActivity.class);

        startActivity(intent);
    }
}
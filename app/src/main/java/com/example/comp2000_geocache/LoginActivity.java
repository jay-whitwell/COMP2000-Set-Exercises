package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button logInButton = findViewById(R.id.logInButton);

        logInButton.setOnClickListener(view -> login());
    }

    // Create the login activity
    public void login()
    {
        Intent intent = new Intent(this, AccountActivity.class);

        // Get the EditText Values
        EditText usernameInput = findViewById(R.id.logInUsername);
        EditText passwordInput = findViewById(R.id.logInPassword);

        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        // Show the errors if username/password is empty
        if (TextUtils.isEmpty(username)) { usernameInput.setError("Please enter a username"); }
        else if (TextUtils.isEmpty(password)) { passwordInput.setError("Please enter a password"); }
        else { startActivity(intent); }
    }
}
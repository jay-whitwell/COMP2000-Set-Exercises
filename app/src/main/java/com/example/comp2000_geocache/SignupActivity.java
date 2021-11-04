package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button createAccountButton = findViewById(R.id.createAccountButton);

        // Was originally the full setOnClickListener, however recommended to change to lambda
        createAccountButton.setOnClickListener(view -> createAccount());
    }

    /** Create the intent of creating an account
     * Currently unsure if I need to add extra
     * if it's a high fidelity prototype
     */
    public void createAccount()
    {
        Intent intent = new Intent(this, LoginActivity.class);

        // Get the EditText Values
        EditText emailInput = findViewById(R.id.emailEditText);
        EditText usernameInput = findViewById(R.id.usernameEditText);
        EditText passwordInput = findViewById(R.id.passwordEditText);

        String email = emailInput.getText().toString();
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        // Show the errors if username/password is empty
        if (TextUtils.isEmpty(email)) { emailInput.setError("Please enter an email"); }
        else if (TextUtils.isEmpty(username)) { usernameInput.setError("Please enter a username"); }
        else if (TextUtils.isEmpty(password)) { passwordInput.setError("Please enter a password"); }
        else { startActivity(intent); }
    }
}
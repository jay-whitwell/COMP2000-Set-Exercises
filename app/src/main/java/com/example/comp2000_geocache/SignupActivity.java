package com.example.comp2000_geocache;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button createAccountButton = findViewById(R.id.createAccountButton);


        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccount();
            }
        });
    }

    /** Create the intent of creating an account
     * Currently unsure if I need to add extra
     * if it's a high fidelity prototype
     */
    public void createAccount()
    {
        Intent intent = new Intent(this, LoginActivity.class);

        startActivity(intent);

    }
}
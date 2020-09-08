package com.teamvoid.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnExit = findViewById(R.id.btnExit);

        btnLogin.setOnClickListener(view -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        btnClear.setOnClickListener(view -> {
            etUsername.setText("");
            etPassword.setText("");
        });

        btnExit.setOnClickListener(view -> this.finish());
    }
}
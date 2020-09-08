package com.teamvoid.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tvUsername);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        textView.setText(username);

        Toast.makeText(this, "Hello " + username, Toast.LENGTH_SHORT).show();

        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(browser);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
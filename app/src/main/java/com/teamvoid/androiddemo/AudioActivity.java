package com.teamvoid.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class AudioActivity extends AppCompatActivity {

    private Button btnStart, btnPause, btnStop;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        btnStart = findViewById(R.id.btnAudioStart);
        btnPause = findViewById(R.id.btnAudioPause);
        btnStop = findViewById(R.id.btnAudioStop);

        // Initial States
        btnStart.setClickable(true);
        btnPause.setClickable(false);
        btnStop.setClickable(false);

        mediaPlayer = MediaPlayer.create(this, R.raw.firestone);

        btnStart.setOnClickListener(view -> {
            btnStart.setClickable(false);
            btnPause.setClickable(true);
            btnStop.setClickable(true);

            mediaPlayer.start();
        });

        btnPause.setOnClickListener(view -> {
            btnStart.setClickable(true);
            btnPause.setClickable(false);
            btnStop.setClickable(true);

            mediaPlayer.pause();
        });

        btnStop.setOnClickListener(view -> {
            btnStart.setClickable(true);
            btnPause.setClickable(false);
            btnStop.setClickable(false);

            mediaPlayer.stop();
        });
    }
}
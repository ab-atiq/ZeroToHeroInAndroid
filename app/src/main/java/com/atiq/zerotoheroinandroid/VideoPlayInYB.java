package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class VideoPlayInYB extends AppCompatActivity {
    WebView PlayVideoInYB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play_in_yb);

        PlayVideoInYB=findViewById(R.id.PlayVideoInYB);

        PlayVideoInYB.getSettings().setJavaScriptEnabled(true);
        PlayVideoInYB.loadUrl("https://youtu.be/GK2ippphNnM");

    }
}
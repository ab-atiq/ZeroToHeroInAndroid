package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class WebPage extends AppCompatActivity {
    WebView websiteShow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);

        websiteShow = findViewById(R.id.websiteShow);

        websiteShow.getSettings().setJavaScriptEnabled(true);
        websiteShow.loadUrl("https://www.w3schools.com/");

    }
}
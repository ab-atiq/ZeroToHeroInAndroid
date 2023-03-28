package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class RelativeLayout3 extends AppCompatActivity {
    WebView RelativeLayoutWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout3);

        RelativeLayoutWebView=findViewById(R.id.RelativeLayoutWebView);

        RelativeLayoutWebView.getSettings().setJavaScriptEnabled(true);
        RelativeLayoutWebView.loadUrl("https://www.w3schools.com/");

    }
}
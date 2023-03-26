package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button aboutBangladesh,digitalTasbih,weightSum,imageVisibility,toastShow,webPage,videoInYoutube,videoInApp,videoPlayer,customStyle,animationStyle,picassoLibrary,lottieAnimation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutBangladesh = findViewById(R.id.aboutBangladesh);
        digitalTasbih = findViewById(R.id.digitalTasbih);
        weightSum = findViewById(R.id.weightSum);
        imageVisibility = findViewById(R.id.imageVisibility);
        toastShow = findViewById(R.id.toastShow);
        webPage = findViewById(R.id.webPage);
        videoInYoutube = findViewById(R.id.videoInYoutube);
        videoInApp = findViewById(R.id.videoInApp);
        videoPlayer=findViewById(R.id.videoPlayer);
        customStyle=findViewById(R.id.customStyle);
        animationStyle=findViewById(R.id.animationStyle);
        picassoLibrary=findViewById(R.id.picassoLibrary);
        lottieAnimation=findViewById(R.id.lottieAnimationPage);

        aboutBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutBDPage = new Intent(MainActivity.this, AboutBangladesh.class);
                startActivity(aboutBDPage);
            }
        });

        weightSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weightSumPage = new Intent(MainActivity.this, WeightSumUse.class);
                startActivity(weightSumPage);
            }
        });

        digitalTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent digitalTasbihPage = new Intent(MainActivity.this, DigitalTasbihPage.class);
                startActivity(digitalTasbihPage);
            }
        });

        imageVisibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visibilityPage = new Intent(MainActivity.this, VisibilityCreate.class);
                startActivity(visibilityPage);
            }
        });

        toastShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Hello! I am toast....\nMy position is set in center of display.",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        webPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WebPage.class));
            }
        });

        videoInYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoPlayInYB.class));
            }
        });

        videoInApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayInApp.videoSongLink="https://www.youtube.com/embed/GK2ippphNnM";
                startActivity(new Intent(MainActivity.this, VideoPlayInApp.class));
            }
        });

        videoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoPlayerApp.class));
            }
        });

        customStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomStyle.class));
            }
        });

        animationStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AnimationActivity.class));
            }
        });

        picassoLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PicassoLibraryPage.class));
            }
        });

        lottieAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LottieAnimationPage.class));
            }
        });

    }
}
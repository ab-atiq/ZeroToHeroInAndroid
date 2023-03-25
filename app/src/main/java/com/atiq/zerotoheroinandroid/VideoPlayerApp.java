package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class VideoPlayerApp extends AppCompatActivity {
    LinearLayout videoSong1,videoSong2,videoSong3,videoSong4;
    Intent videoPlay;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player_app);
        videoSong1=findViewById(R.id.videoSong1);
        videoSong2=findViewById(R.id.videoSong2);
        videoSong3=findViewById(R.id.videoSong3);
        videoSong4=findViewById(R.id.videoSong4);

        videoSong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayInApp.videoSongLink="https://www.youtube.com/embed/pd0nogrj-38";
                videoPlay = new Intent(VideoPlayerApp.this, VideoPlayInApp.class);
                startActivity(videoPlay);
            }
        });

        videoSong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayInApp.videoSongLink="https://www.youtube.com/embed/GK2ippphNnM";
                videoPlay = new Intent(VideoPlayerApp.this, VideoPlayInApp.class);
                startActivity(videoPlay);
            }
        });

        videoSong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayInApp.videoSongLink="https://www.youtube.com/embed/5Zvfd_ntlG0";
                videoPlay = new Intent(VideoPlayerApp.this, VideoPlayInApp.class);
                startActivity(videoPlay);
            }
        });

        videoSong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayInApp.videoSongLink="https://www.youtube.com/embed/cwASfUe9dGo";
                videoPlay = new Intent(VideoPlayerApp.this, VideoPlayInApp.class);
                startActivity(videoPlay);
            }
        });

    }
}
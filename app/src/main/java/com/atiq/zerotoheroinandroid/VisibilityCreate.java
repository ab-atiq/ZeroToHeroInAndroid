package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class VisibilityCreate extends AppCompatActivity {
    Button imageVisible, imageInvisible, imageGone, fullLayoutGone;
    ImageView imageVisibilityCheck;
    LinearLayout layoutGone;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility_create);

        imageVisibilityCheck = findViewById(R.id.imageVisibilityCheck);
        imageVisible = findViewById(R.id.imageVisible);
        imageInvisible = findViewById(R.id.imageInvisible);
        imageGone = findViewById(R.id.imageGone);
        fullLayoutGone = findViewById(R.id.fullLayoutGone);
        layoutGone = findViewById(R.id.layoutGone);

        imageVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageVisibilityCheck.setVisibility(View.VISIBLE);
            }
        });

        imageInvisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageVisibilityCheck.setVisibility(View.INVISIBLE);
            }
        });

        imageGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageVisibilityCheck.setVisibility(View.GONE);
            }
        });

        fullLayoutGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutGone.setVisibility(View.GONE);
            }
        });


    }
}
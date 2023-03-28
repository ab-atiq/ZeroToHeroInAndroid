package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayout extends AppCompatActivity {
    Button firstRelativeLayout,secondRelativeLayout,thirdRelativeLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        firstRelativeLayout = findViewById(R.id.firstRelativeLayout);
        secondRelativeLayout = findViewById(R.id.secondRelativeLayout);
        thirdRelativeLayout = findViewById(R.id.thirdRelativeLayout);

        firstRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RelativeLayout.this,RelativeLayout1.class));
            }
        });

        secondRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RelativeLayout.this,RelativeLayout2.class));
            }
        });

        thirdRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RelativeLayout.this,RelativeLayout3.class));
            }
        });


    }
}
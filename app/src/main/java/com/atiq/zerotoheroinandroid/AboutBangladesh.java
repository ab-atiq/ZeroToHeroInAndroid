package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutBangladesh extends AppCompatActivity {
    Button seeMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_bangladesh);

        seeMore=findViewById(R.id.seeMore);

        seeMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seeMorePage = new Intent(AboutBangladesh.this,DetailsBangladeshPage.class);
                startActivity(seeMorePage);
            }
        });

    }
}
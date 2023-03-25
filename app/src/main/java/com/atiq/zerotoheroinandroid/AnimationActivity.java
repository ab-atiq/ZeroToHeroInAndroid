package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    Button flagAnimationBtn;
    ImageView flagAnimation;
    Animation myAnim;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        flagAnimationBtn=findViewById(R.id.flagAnimationBtn);
        flagAnimation=findViewById(R.id.flagAnimation);
        myAnim= AnimationUtils.loadAnimation(AnimationActivity.this,R.anim.my_anim);

        flagAnimationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagAnimation.startAnimation(myAnim);
            }
        });

    }
}
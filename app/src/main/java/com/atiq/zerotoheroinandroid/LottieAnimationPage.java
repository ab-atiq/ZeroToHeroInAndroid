package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class LottieAnimationPage extends AppCompatActivity {

    Button changeLottieAnimationBtn;
    LottieAnimationView animationView1,animationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_animation_page);

        changeLottieAnimationBtn=findViewById(R.id.changeLottieAnimationBtn);
        animationView1=findViewById(R.id.animationView1);
        animationView2=findViewById(R.id.animationView2);

        changeLottieAnimationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animationView1.setAnimationFromUrl("https://assets6.lottiefiles.com/packages/lf20_owg7kezi.json");
                animationView1.playAnimation();
                animationView1.loop(true);

                animationView2.setAnimation(R.raw.happy_giftbox);
                animationView2.playAnimation();
                animationView2.loop(true);
            }
        });


    }
}
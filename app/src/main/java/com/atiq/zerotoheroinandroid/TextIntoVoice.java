package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TextIntoVoice extends AppCompatActivity {
    Button readTextBtn;
    EditText readInputText;

    TextToSpeech textToSpeech;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_into_voice);

        readTextBtn=findViewById(R.id.readTextBtn);
        readInputText=findViewById(R.id.readInputText);


        textToSpeech=new TextToSpeech(TextIntoVoice.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        readTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = readInputText.getText().toString();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    if(inputText.length()>0) {
                        textToSpeech.speak(inputText, TextToSpeech.QUEUE_FLUSH, null, null);
                    }
                    else{
                        readInputText.setError("Please, write something. Then click button.");
                    }
                }
            }
        });

    }
}
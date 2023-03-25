package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DigitalTasbihPage extends AppCompatActivity {
    TextView displayTasbih;
    Button addTasbih,subTasbih, resetTasbih;

    static int count = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_tasbih_page);

        displayTasbih=findViewById(R.id.displayTasbih);
        addTasbih=findViewById(R.id.addTashib);
        subTasbih=findViewById(R.id.subTasbih);
        resetTasbih=findViewById(R.id.resetTasbih);

        addTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                String st = Integer.toString(count);
                displayTasbih.setText(st);
            }
        });

        subTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                displayTasbih.setText(""+count);
            }
        });

        resetTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                displayTasbih.setText(""+count);
            }
        });
    }
}
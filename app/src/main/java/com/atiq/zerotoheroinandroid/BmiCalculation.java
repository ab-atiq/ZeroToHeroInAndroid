package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiCalculation extends AppCompatActivity {
    EditText inputHeightFeet,inputHeightInch,inputWeight;
    TextView displayText;
    Button calculationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculation);

//      BMI calculation
        inputHeightFeet=findViewById(R.id.heightFeet);
        inputHeightInch=findViewById(R.id.heightInch);
        inputWeight=findViewById(R.id.weightKg);
        calculationButton=findViewById(R.id.calculateBMI);
        displayText=findViewById(R.id.displayResult);

        calculationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SWeight,SHeightFeet, SHeightInch;
                SWeight=inputWeight.getText().toString();
                SHeightFeet=inputHeightFeet.getText().toString();
                SHeightInch=inputHeightInch.getText().toString();
                if(SWeight.length()>0&&SHeightFeet.length()>0 && SHeightInch.length()>0) {
                    double weight, height, BMI;
                    weight = Double.parseDouble(SWeight);
                    height = (Double.parseDouble(SHeightFeet) * .3048) + (Double.parseDouble(SHeightInch) * .0254);
                    BMI = weight / (height * height);
                    if (BMI > 24) {
                        displayText.setText("Your BMI is: " + BMI + "\nYou are Motu");
                    } else if (BMI > 18) {
                        displayText.setText("Your BMI is: " + BMI + "\nYou are Handsome");
                    } else {
                        displayText.setText("Your BMI is: " + BMI + "\nYou are chikna");
                    }
                }
                else{
                    Toast.makeText(BmiCalculation.this,"Please, Input fields.",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
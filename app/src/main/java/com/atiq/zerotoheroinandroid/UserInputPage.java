package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserInputPage extends AppCompatActivity {

    Button inputUserNameBtn;
    EditText inputUserName;
    TextView displayUserName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_page);

        inputUserNameBtn=findViewById(R.id.inputUserNameBtn);
        inputUserName=findViewById(R.id.inputUserName);
        displayUserName=findViewById(R.id.displayUserName);

        inputUserNameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(inputUserName.getText());
//                String name = inputUserName.getText().toString();
                displayUserName.setText("Hello! "+name+" \nHow are your?");
            }
        });



    }
}
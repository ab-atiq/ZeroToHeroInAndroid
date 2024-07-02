package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText signUpEmail, signUpPassword;
    private TextView signInTextView;
    private Button signUpButton;
    private ProgressBar signUpProgressbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        this.setTitle("Sign Up Page");

        signUpEmail = findViewById(R.id.signUpEmailEditText);
        signUpPassword = findViewById(R.id.signUpPasswordEditText);
        signUpButton = findViewById(R.id.signUpButton);
        signInTextView = findViewById(R.id.signInTextView);
        signUpProgressbar = findViewById(R.id.signUpProgressBar);

        signUpButton.setOnClickListener(this);
        signInTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signUpButton:
                userRegister();
                break;
            case R.id.signInTextView:
                startActivity(new Intent(getApplicationContext(), FirebaseAuthentication.class));
                break;
        }
    }

    private void userRegister() {
        String email,password;
        email=signUpEmail.getText().toString();
        password=signUpPassword.getText().toString();
        //checking the validity of the email
        if(email.isEmpty())
        {
            signUpEmail.setError("Enter an email address");
            signUpEmail.requestFocus(); // cursor will go this text field
            return;
        }
        // if email address is not match with by default created android app rule
        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            signUpEmail.setError("Enter a valid email address");
            signUpEmail.requestFocus(); // cursor will go this text field
            return;
        }
        //checking the validity of the password
        if(password.isEmpty())
        {
            signUpPassword.setError("Enter a password");
            signUpPassword.requestFocus();
            return;
        }
        if(password.length()<8)
        {
            signUpPassword.setError("Minimum length of the password be 8");
            signUpPassword.requestFocus();
            return;
        }

    }
}
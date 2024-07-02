package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirebaseAuthentication extends AppCompatActivity implements View.OnClickListener {
    private EditText signInEmail, signInPassword;
    private TextView signUpTextView;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_authentication);
        // set title of android page
        this.setTitle("Sign In Activity");

        signInEmail=findViewById(R.id.signInEmailEditText);
        signInPassword=findViewById(R.id.signInPasswordEditText);
        signUpTextView=findViewById(R.id.signUpTextView);
        signInButton=findViewById(R.id.signInButton);

        // set on click listener
        signInButton.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signInButton:
                userLogIn();
                break;
            case R.id.signUpTextView:
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
                break;
        }
    }

    private void userLogIn() {
        String email,password;
        email=signInEmail.getText().toString();
        password=signInPassword.getText().toString();
        //checking the validity of the email
        if(email.isEmpty())
        {
            signInEmail.setError("Enter an email address");
            signInEmail.requestFocus(); // cursor will go this text field
            return;
        }
        // if email address is not match with by default created android app rule
        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            signInEmail.setError("Enter a valid email address");
            signInEmail.requestFocus(); // cursor will go this text field
            return;
        }
        //checking the validity of the password
        if(password.isEmpty())
        {
            signInPassword.setError("Enter a password");
            signInPassword.requestFocus();
            return;
        }
        if(password.length()<8)
        {
            signInPassword.setError("Minimum length of the password be 8");
            signInPassword.requestFocus();
            return;
        }


    }
}
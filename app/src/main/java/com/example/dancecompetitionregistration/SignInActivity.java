package com.example.dancecompetitionregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    private EditText FullName;
    private EditText Email;
    private EditText CreatePassword;
    private EditText ConfirmPassword;
    private Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        FullName = (EditText)findViewById(R.id.etName);
        Email = (EditText)findViewById(R.id.etEmail);
        CreatePassword = (EditText)findViewById(R.id.etCreatePassword);
        ConfirmPassword = (EditText)findViewById(R.id.etConfirmPassword);
        SignUp = (Button)findViewById(R.id.btnSignUp);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details(FullName.getText().toString() , Email.getText().toString() , CreatePassword.getText().toString() , ConfirmPassword.getText().toString());
            }
        });
    }
    private void details(String userFullName , String userEmail , String userCreatePassword , String userConfirmPassword){
        if((userFullName.equals("Riya Singh") || userFullName.equals("Rohan Shah") && userEmail.equals("xyz@gmail.com") && userCreatePassword.equals("1234") && userConfirmPassword.equals("1234"))){
            Intent intent = new Intent(SignInActivity.this , SecondActivity.class);
            startActivity(intent);
        }
    }
}


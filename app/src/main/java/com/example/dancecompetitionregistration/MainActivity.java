package com.example.dancecompetitionregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EmailAddress;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailAddress = (EditText)findViewById(R.id.etEmailId);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
        SignIn = (Button)findViewById(R.id.btnSignIn);

        Info.setText("Dont have an existing account?");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(EmailAddress.getText().toString() , Password.getText().toString());
            }
        });


    }

    private void validate(String userEmailAddress, String userPassword) {
        if ((userEmailAddress.equals("xyz@gmail.com")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        } else
        {
            SignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, SignInActivity.class));


                }
            });
        }}



}


package com.example.dancecompetitionregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView Information;
    private EditText DanceStyle;
    private EditText PhoneNo;
    private EditText Age;
    private Button SUBMIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Information = (TextView) findViewById(R.id.tvInformation);
        DanceStyle = (EditText) findViewById(R.id.etDanceStyle);
        PhoneNo = (EditText) findViewById(R.id.etPhoneNo);
        Age = (EditText) findViewById(R.id.etAge);
        SUBMIT = (Button) findViewById(R.id.btnSUBMIT);

        Information.setText("Enter your details");

        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(DanceStyle.getText().toString() , PhoneNo.getText().toString() , Age.getText().toString());

            }
        });
    }
    private void validate(String userDanceStyle , String userPhoneNo , String userAge){
        if((userDanceStyle.equals("HipHop") || userDanceStyle.equals("Contemporary") || userDanceStyle.equals("Classical") || userDanceStyle.equals("FreeStyle") && userPhoneNo.equals("654321") && userAge.equals("15") || userAge.equals("16") || userAge.equals("17") || userAge.equals("18") || userAge.equals("19") || userAge.equals("20"))){
            Intent intent = new Intent(SecondActivity.this , FinalActivity.class);
            startActivity(intent);
            SUBMIT.setEnabled(true);
        }
    }


}


package com.project.dogbreeds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    String title, information;
    TextView activity_information_tv_title, activity_information_tv_information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Intent i = getIntent();


        Bundle extras = i.getExtras();

        title = extras.getString("title");
        information = extras.getString("information");


        activity_information_tv_title = findViewById(R.id.activity_information_tv_title);
        activity_information_tv_information = findViewById(R.id.activity_information_tv_information);

        activity_information_tv_title.setText(title);
        activity_information_tv_information.setText(information);


    }
}
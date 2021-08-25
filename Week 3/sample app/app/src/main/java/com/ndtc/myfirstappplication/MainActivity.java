package com.ndtc.myfirstappplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void displayText(View view) {


        EditText et_firstnumber = findViewById(R.id.et_firstnumber);
        EditText et_secondnumber = findViewById(R.id.et_secondnumber);
        int firstnumber = Integer.parseInt(et_firstnumber.getText().toString());
        int secondnumber = Integer.parseInt(et_secondnumber.getText().toString());
        int sum = firstnumber + secondnumber;

        Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();

    }

}
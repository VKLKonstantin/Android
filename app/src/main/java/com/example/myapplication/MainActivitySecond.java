package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ScrollView;

public class MainActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        EditText editText3 = findViewById(R.id.editTextTextPersonName3);
        EditText editText4 = findViewById(R.id.editTextTextPersonName4);
        EditText editText5 = findViewById(R.id.editTextTextPersonName5);
        EditText editText6 = findViewById(R.id.editTextTextPersonName6);


        CalendarView calendarView = findViewById(R.id.calendarView);


    }
}
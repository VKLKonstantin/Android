package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        Switch sw = findViewById(R.id.switch1);
        CheckBox checkBox = findViewById(R.id.checkBox);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
    }


}
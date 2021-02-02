package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        Button buttonOne = findViewById(R.id.button1);
        Button buttonTwo = findViewById(R.id.button2);
        Button buttonThree = findViewById(R.id.button3);
        Button buttonFour = findViewById(R.id.button4);
        Button buttonFive = findViewById(R.id.button5);
        Button buttonSix = findViewById(R.id.button6);
        Button buttonSeven = findViewById(R.id.button7);
        Button buttonEight = findViewById(R.id.button8);
        Button buttonNine = findViewById(R.id.button9);
        Button buttonZero = findViewById(R.id.button0);

        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        Button buttonPoint = findViewById(R.id.buttonPoint);
        Button buttonEquals = findViewById(R.id.buttonEquals);

        Button buttonClear = findViewById(R.id.buttonC);
        buttonClear.setBackgroundColor(Color.RED);

        TextView monitor = findViewById(R.id.Monitor);
        monitor.setMovementMethod(new ScrollingMovementMethod());
    }
}
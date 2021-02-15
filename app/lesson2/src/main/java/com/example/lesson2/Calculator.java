package com.example.lesson2;


import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero;
    private Button buttonMinus, buttonPlus, buttonMultiply, buttonDivision, buttonPoint, buttonEquals, buttonClear, buttonCE;
    private TextView monitor;
    private String s;
    private final static String KEY = "key";
    private LogicCalculator calculator = calculator = new LogicCalculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        initView();
        initListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                monitor.append("1");
                break;
            case R.id.button2:
                monitor.append("2");
                break;
            case R.id.button3:
                monitor.append("3");
                break;
            case R.id.button4:
                monitor.append("4");
                break;
            case R.id.button5:
                monitor.append("5");
                break;
            case R.id.button6:
                monitor.append("6");
                break;
            case R.id.button7:
                monitor.append("7");
                break;
            case R.id.button8:
                monitor.append("8");
                break;
            case R.id.button9:
                monitor.append("9");
                break;
            case R.id.button0:
                monitor.append("0");
                break;
            case R.id.buttonPlus:
                calculator.calculationAdd(monitor);
                monitor.setText("");
                monitor.append("+");
                break;
            case R.id.buttonMinus:
                calculator.calculationMinus(monitor);
                monitor.setText("");
                monitor.append("-");
                break;
            case R.id.buttonMultiply:
                calculator.calculationMultiply(monitor);
                monitor.setText("");
                monitor.append("*");
                break;
            case R.id.buttonDivision:
                calculator.calculationDivision(monitor);
                monitor.setText("");
                monitor.append("/");
                break;
            case R.id.buttonEquals:
                calculator.outputResult(monitor);
                break;

            case R.id.buttonC:
                monitor.setText("");
                calculator.clearMonitorAndMemory();
                break;
            case R.id.buttonPoint:
                monitor.append(".");
                break;
            case R.id.buttonCE:
                String str = monitor.getText().toString();
                if (!str.equals(""))
                    str = str.substring(0, str.length() - 1);
                monitor.setText(str);
                break;
        }

    }

    public void initView() {
        buttonOne = findViewById(R.id.button1);
        buttonTwo = findViewById(R.id.button2);
        buttonThree = findViewById(R.id.button3);
        buttonFour = findViewById(R.id.button4);
        buttonFive = findViewById(R.id.button5);
        buttonSix = findViewById(R.id.button6);
        buttonSeven = findViewById(R.id.button7);
        buttonEight = findViewById(R.id.button8);
        buttonNine = findViewById(R.id.button9);
        buttonZero = findViewById(R.id.button0);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonC);
        buttonCE = findViewById(R.id.buttonCE);
        buttonClear.setBackgroundColor(Color.RED);
        monitor = findViewById(R.id.monitor);
        monitor.setMovementMethod(new ScrollingMovementMethod());
    }

    public void initListener() {
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonPoint.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonCE.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        s = monitor.getText().toString();
        outState.putString(KEY, s);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        s = savedInstanceState.getString(KEY);
        monitor.setText(s);
    }

}
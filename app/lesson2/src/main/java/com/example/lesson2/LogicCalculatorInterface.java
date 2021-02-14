package com.example.lesson2;

import android.widget.TextView;

public interface LogicCalculatorInterface {
    void calculationAdd(TextView monitor);

    void calculationMinus(TextView monitor);

    void calculationMultiply(TextView monitor);

    void calculationDivision(TextView monitor);

    void outputResult(TextView monitor);

    void clearMonitorAndMemory();
}

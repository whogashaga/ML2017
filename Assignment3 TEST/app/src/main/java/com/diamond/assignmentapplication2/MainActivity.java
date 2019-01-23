package com.diamond.assignmentapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button point;
    private Button plus;
    private Button minus;
    private Button times;
    private Button divide;
    private TextView info;
    private TextView result;
    private final char PLUS = '+';
    private final char MINUS = '-';
    private final char TIMES = 'x';
    private final char DIVIDE = '÷';
    private double value1 = Double.NaN;
    private double value2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }

    private void setupUIViews(){
        zero = (Button) findViewById(R.id.calculator_0);
        one = (Button) findViewById(R.id.calculator_1);
        two = (Button) findViewById(R.id.calculator_2);
        three = (Button) findViewById(R.id.calculator_3);
        four = (Button) findViewById(R.id.calculator_4);
        five = (Button) findViewById(R.id.calculator_5);
        six = (Button) findViewById(R.id.calculator_6);
        seven = (Button) findViewById(R.id.calculator_7);
        eight = (Button) findViewById(R.id.calculator_8);
        nine = (Button) findViewById(R.id.calculator_9);
        point = (Button) findViewById(R.id.calculator_point);
        plus = (Button) findViewById(R.id.calculator_plus);
        minus = (Button) findViewById(R.id.calculator_minus);
        times = (Button) findViewById(R.id.calculator_times);
        divide = (Button) findViewById(R.id.calculator_divide);
        info = (TextView) findViewById(R.id.calculation);
        result = (TextView) findViewById(R.id.finalValue);

    }
}


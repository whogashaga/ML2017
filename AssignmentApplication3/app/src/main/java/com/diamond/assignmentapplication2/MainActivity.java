package com.diamond.assignmentapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import  android.widget.Button;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private  TextView Answer;
    private  TextView Expression;
    private  String display1 = "";
    private  String display2 = "";
    private  String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Expression = (TextView) findViewById(R.id.calculation);
        Answer = (TextView) findViewById(R.id.finalValue);
        Answer.setText(display1);
        Expression.setText(display2);
    }

    private  void updateScreen(){  //For printing on the screen
        Answer.setText(display1);
        Expression.setText(display2);
    }

    public void onClickNumber(View v){ // To take input number from view
        Button first = (Button) v;
        display2 += first.getText();
        updateScreen();
    }

    public void onClickOperator(View v){  //TO take input operator
        Button second = (Button) v;
        display2 += second.getText();
        currentOperator = second.getText().toString();
        updateScreen();
    }

    private double operate(String a, String b, String op){
        if ("+".equals(op)) {
            return (Double.valueOf(a) + (Double.valueOf(b)));
        } else if ("-".equals(op)) {
            return (Double.valueOf(a) - (Double.valueOf(b)));
        } else if ("x".equals(op)) {
            return (Double.valueOf(a) * (Double.valueOf(b)));
        } else if ("÷".equals(op)) {
            return (Double.valueOf(a) / Double.valueOf(b));
        } else {
            return -1;
        }
    }

    public  void onClickEqual(View v){ //After clicking " = "
        String[] operation = display2.split(Pattern.quote(currentOperator));

        if (operation.length < 2)
            return;

            Double result = operate(operation[0], operation[1], currentOperator);
            Answer.setText(String.valueOf(result));

    }

    private void reset(){
        display1 = "";
        display2 = "";
        currentOperator = "";
    }

    public void onClickReset(View v){
        reset();
        updateScreen();
    }
}



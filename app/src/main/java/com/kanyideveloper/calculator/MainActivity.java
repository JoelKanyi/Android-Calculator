package com.kanyideveloper.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView mathField,AnswerField;
    Button one,two,three,four,five,six,seven,eight,nine,dot,
            zero,plus,minus,multiplication,division,invertSign,
            tan,sin,cos,doubleZero,openingBracket,closingBracket,clear,equal;
    int calculation;
    double num;
    double answer;
    int numTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        one = findViewById(R.id.btnOne);
        two = findViewById(R.id.btnTwo);
        three = findViewById(R.id.btnThree);
        four = findViewById(R.id.btnFour);
        five = findViewById(R.id.btnFive);
        six = findViewById(R.id.btnSix);
        seven = findViewById(R.id.btnSeven);
        eight = findViewById(R.id.btnEight);
        nine = findViewById(R.id.btnNine);
        zero = findViewById(R.id.btnZero);
        doubleZero = findViewById(R.id.btnDoubleZero);
        dot = findViewById(R.id.btnDot);
        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        multiplication = findViewById(R.id.btnMultiply);
        division = findViewById(R.id.btnDivide);
        openingBracket = findViewById(R.id.btnOpeningBracket);
        closingBracket = findViewById(R.id.btnClosingBracket);
        invertSign = findViewById(R.id.btnInvertSign);
        clear = findViewById(R.id.btnClear);
        sin = findViewById(R.id.btnSin);
        tan = findViewById(R.id.btnTan);
        cos = findViewById(R.id.btnCos);
        mathField = findViewById(R.id.btnMathField);
        AnswerField = findViewById(R.id.btnAnswerField);
        equal = findViewById(R.id.btnEquals);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"1");
                //jTextField1.setText(jTextField1.getText()+"1");

/*
                StringBuilder stringBuilder = new StringBuilder();
                mathField.setText(stringBuilder.append(mathField.getText()+"1"));
                AnswerField.setText(stringBuilder.toString());*/
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AnswerField.setText(AnswerField.getText()+".");
            }
        });

        doubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnswerField.setText(AnswerField.getText()+"00");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = Double.parseDouble(AnswerField.getText().toString());
                calculation = 1;
                AnswerField.setText("");
                mathField.setText(num+"+");


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(AnswerField.getText().toString());
                calculation = 2;
                AnswerField.setText("");
                mathField.setText(num+"-");
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(AnswerField.getText().toString());
                calculation = 3;
                AnswerField.setText("");
                mathField.setText(num+"X");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Double.parseDouble(AnswerField.getText().toString());
                calculation = 4;
                AnswerField.setText("");
                mathField.setText(num+"/");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathField.setText("");
                AnswerField.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithOperations();
                mathField.setText("");
            }
        });

    }

    public void arithOperations(){
        switch (calculation){
            case 1:{
                answer = num + Double.parseDouble(AnswerField.getText().toString());
                AnswerField.setText(Double.toString(answer));
                break;}
            case 2:{
                answer = num - Double.parseDouble(AnswerField.getText().toString());
                AnswerField.setText(Double.toString(answer));
                break;}
            case 3:{
                answer = num * Double.parseDouble(AnswerField.getText().toString());
                AnswerField.setText(Double.toString(answer));
                break;}
            case 4:{
                answer = num / Double.parseDouble(AnswerField.getText().toString());
                AnswerField.setText(Double.toString(answer));
                break;}
        }
    }

}

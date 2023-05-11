package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private TextView inputTextView, resultTextView;
    private String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextView = findViewById(R.id.inputTextView);
        resultTextView = findViewById(R.id.resultTextView);

        Button buttonSin = findViewById(R.id.buttonSin);
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "sin(";
                inputTextView.setText(input);
            }
        });

        Button buttonCos = findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "cos(";
                inputTextView.setText(input);
            }
        });

        Button buttonTan = findViewById(R.id.buttonTan);
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "tan(";
                inputTextView.setText(input);
            }
        });

        Button buttonLog = findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "log(";
                inputTextView.setText(input);
            }
        });

        Button buttonBracket = findViewById(R.id.buttonRightBracket);
        buttonBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += ")";
                inputTextView.setText(input);
            }
        });

        Button buttonLn = findViewById(R.id.buttonLn);
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "ln(";
                inputTextView.setText(input);
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "7";
                inputTextView.setText(input);
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "8";
                inputTextView.setText(input);
            }
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "9";
                inputTextView.setText(input);
            }
        });

        Button buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "/";
                inputTextView.setText(input);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "4";
                inputTextView.setText(input);
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "5";
                inputTextView.setText(input);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "6";
                inputTextView.setText(input);
            }
        });

        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "*";
                inputTextView.setText(input);
            }
        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "1";
                inputTextView.setText(input);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "2";
                inputTextView.setText(input);
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "3";
                inputTextView.setText(input);
            }
        });

        Button buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "-";
                inputTextView.setText(input);
            }
        });

        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "0";
                inputTextView.setText(input);
            }
        });

//        Button buttonDecimal = findViewById(R.id.buttonDecimal);
        Button buttonDecimal = findViewById(R.id.buttonDot);
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += ".";
                inputTextView.setText(input);
            }
        });

        Button buttonEquals = findViewById(R.id.buttonEqual);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression expression = new Expression(input);
                String result = String.valueOf(expression.calculate());
                resultTextView.setText(result);
            }
        });

        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += "+";
                inputTextView.setText(input);
            }
        });

        Button buttonClear = findViewById(R.id.buttonClr);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = "";
                inputTextView.setText("");
                resultTextView.setText("");
            }
        });
    }
}


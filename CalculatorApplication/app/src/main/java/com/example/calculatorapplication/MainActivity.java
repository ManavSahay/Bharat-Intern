package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMultiply;
    private Button buttonDiv;
    private Button button_C;
    private Button buttonEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_0 = findViewById(R.id.button_0);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDiv = findViewById(R.id.buttonDivide);
        button_C = findViewById(R.id.button_C);
        buttonEquals = findViewById(R.id.buttonEquals);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "1";
                textView.setText(s);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "2";
                textView.setText(s);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "3";
                textView.setText(s);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "4";
                textView.setText(s);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "5";
                textView.setText(s);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "6";
                textView.setText(s);
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "7";
                textView.setText(s);
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "8";
                textView.setText(s);
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "9";
                textView.setText(s);
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                s += "0";
                textView.setText(s);
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                int flag = 1;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '*' || s.charAt(s.length() - 1) == '/') {
                    flag = -1;
                    String subStr = s.substring(0, s.length() - 1);
                    subStr += '+';
                    textView.setText(subStr);
                }
                if (flag == 1) {
                    s += "+";
                    textView.setText(s);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                int flag = 1;
                if (s.length() > 1) {
                    if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '*' || s.charAt(s.length() - 1) == '/') {
                        flag = -1;
                        String subStr = s.substring(0, s.length() - 1);
                        subStr += '-';
                        textView.setText(subStr);
                    }
                    if (flag == 1) {
                        s += "-";
                        textView.setText(s);
                    }
                }
                else {
                    s += '-';
                    textView.setText(s);
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                int flag = 1;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '*' || s.charAt(s.length() - 1) == '/') {
                    flag = -1;
                    String subStr = s.substring(0, s.length() - 1);
                    subStr += '*';
                    textView.setText(subStr);
                }
                if (flag == 1) {
                    s += "*";
                    textView.setText(s);
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                int flag = 1;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '*' || s.charAt(s.length() - 1) == '/') {
                    flag = -1;
                    String subStr = s.substring(0, s.length() - 1);
                    subStr += '/';
                    textView.setText(subStr);
                }
                if (flag == 1) {
                    s += "/";
                    textView.setText(s);
                }
            }
        });
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView.getText().toString();
                String[] str = s.split("");
                int number = 0;
                char operation = ' ';
                int op1 = 1, op2 = 1;
                if (str[0].equals("-")) {
                    op1 = -1;
                }
                for (int i = 0; i < str.length; i++) {
                    if ((str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")) && i != 0) {
                        op1 = op1 * number;
                        number = 0;
                        operation = str[i].charAt(0);
                    }
                    else if (!str[i].equals("-")) {
                        number = number * 10 + Integer.parseInt(str[i]);
                    }
                }
                op2 = op2 * number;
                int result = 0;
                int errorFlag = 1;
                switch (operation) {
                    case '+' -> result = op1 + op2;
                    case '-' -> result = op1 - op2;
                    case '*' -> result = op1 * op2;
                    case '/' -> {
                        if (op2 == 0) {
                            errorFlag = -1;
                        }
                        else {
                            result = op1 / op2;
                        }
                    }
                }
                if (errorFlag == 1) {
                    textView.setText(Integer.toString(result));
                }
                else {
                    textView.setText("Error!");
                }
            }
        });
    }
}
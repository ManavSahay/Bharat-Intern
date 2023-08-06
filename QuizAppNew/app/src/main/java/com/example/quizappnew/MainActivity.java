package com.example.quizappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView questionView, finalScore;
    Button option01, option02, option03, option04;
    Button submit, reset;
    Button clBtn;

    int questionIndex = 0;
    int score = 0;
    int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionView = findViewById(R.id.questionView);
        finalScore = findViewById(R.id.finalScore);
        option01 = findViewById(R.id.option01);
        option02 = findViewById(R.id.option02);
        option03 = findViewById(R.id.option03);
        option04 = findViewById(R.id.option04);
        submit = findViewById(R.id.submit);
        reset = findViewById(R.id.resetButton);

        option01.setBackgroundColor(Color.parseColor("#dba72c"));
        option02.setBackgroundColor(Color.parseColor("#dba72c"));
        option03.setBackgroundColor(Color.parseColor("#dba72c"));
        option04.setBackgroundColor(Color.parseColor("#dba72c"));

        loadQuestion();

        option01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option01.setBackgroundColor(Color.MAGENTA);
                clBtn = findViewById(R.id.option01);
                option02.setBackgroundColor(Color.parseColor("#dba72c"));
                option03.setBackgroundColor(Color.parseColor("#dba72c"));
                option04.setBackgroundColor(Color.parseColor("#dba72c"));
            }
        });
        option02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option02.setBackgroundColor(Color.MAGENTA);
                clBtn = findViewById(R.id.option02);
                option01.setBackgroundColor(Color.parseColor("#dba72c"));
                option03.setBackgroundColor(Color.parseColor("#dba72c"));
                option04.setBackgroundColor(Color.parseColor("#dba72c"));
            }
        });
        option03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option03.setBackgroundColor(Color.MAGENTA);
                clBtn = findViewById(R.id.option03);
                option01.setBackgroundColor(Color.parseColor("#dba72c"));
                option02.setBackgroundColor(Color.parseColor("#dba72c"));
                option04.setBackgroundColor(Color.parseColor("#dba72c"));
            }
        });
        option04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option04.setBackgroundColor(Color.MAGENTA);
                clBtn = findViewById(R.id.option04);
                option01.setBackgroundColor(Color.parseColor("#dba72c"));
                option02.setBackgroundColor(Color.parseColor("#dba72c"));
                option03.setBackgroundColor(Color.parseColor("#dba72c"));
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clBtn.setBackgroundColor(Color.parseColor("#dba72c"));
                String text = clBtn.getText().toString();
                if (text.equals(QuestionsAnswers.answers[questionIndex])) {
                    score++;
                    questionIndex++;
                }
                else {
                    questionIndex++;
                }
                if (questionIndex < QuestionsAnswers.questions.length) {
                    loadQuestion();
                }
                else {
                    if (score == QuestionsAnswers.questions.length) {
                        finalScore.setTextColor(Color.parseColor("#dba72c"));
                        finalScore.setText(Integer.toString(score) + " / " + QuestionsAnswers.questions.length);
                    }
                    else if (score > QuestionsAnswers.questions.length / 2 && score < QuestionsAnswers.questions.length) {
                        finalScore.setTextColor(Color.parseColor("#01ffff"));
                        finalScore.setText(Integer.toString(score) + " / " + QuestionsAnswers.questions.length);
                    }
                    else {
                        finalScore.setTextColor(Color.parseColor("#9b0000"));
                        finalScore.setText(Integer.toString(score) + " / " + QuestionsAnswers.questions.length);
                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionIndex = 0;
                score = 0;
                finalScore.setTextColor(Color.GRAY);
                finalScore.setText("--/--");
                loadQuestion();
            }
        });
    }
    void loadQuestion() {
        questionView.setText(QuestionsAnswers.questions[questionIndex]);
        option01.setText(QuestionsAnswers.options[questionIndex][0]);
        option02.setText(QuestionsAnswers.options[questionIndex][1]);
        option03.setText(QuestionsAnswers.options[questionIndex][2]);
        option04.setText(QuestionsAnswers.options[questionIndex][3]);
    }
}
package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView result;
    EditText celciusEnter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        result = findViewById(R.id.result);
        celciusEnter = findViewById(R.id.celciusEnter);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = celciusEnter.getText().toString();
                double celcius = Double.parseDouble(s);
                double farenheight = celcius * (9.0 / 5.0) + 32.0;
                result.setText(Double.toString(farenheight));
                imageView.setColorFilter(Color.MAGENTA);
            }
        });
    }
}
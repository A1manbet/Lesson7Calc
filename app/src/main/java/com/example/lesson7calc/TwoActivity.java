package com.example.lesson7calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class TwoActivity extends AppCompatActivity {
//    private TextView heart = findViewById(R.id.heart);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        String textFromMain = getIntent().getStringExtra("key");
        TextView textView = findViewById(R.id.explore_the);
        textView.setText(textFromMain.toString());


        Button button_next = findViewById(R.id.buttonWithGradient);
        button_next.setOnClickListener(view -> {
            onDestroy();
        });

        TextView heart=findViewById(R.id.heart);
        AtomicReference<Boolean> heart2= new AtomicReference<>(false);
        heart.setOnClickListener(view -> {
            if (heart2.get() ==false){
                heart.setBackgroundResource(R.drawable.heart_two);
                heart2.set(true);
            } else if (heart2.get()==true) {
                heart.setBackgroundResource(R.drawable.heart);
                heart2.set(false);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
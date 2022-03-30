package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CountUp(View view) {
        count++;
        TextView textView = findViewById(R.id.txt_count);
        textView.setText(Integer.toString(count));
    }
    public void CountDown(View view) {
        count--;
        TextView textView = findViewById(R.id.txt_count);
        textView.setText(Integer.toString(count));
    }
}
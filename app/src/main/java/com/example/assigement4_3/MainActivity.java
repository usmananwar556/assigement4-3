package com.example.assigement4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker picker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        picker = findViewById(R.id.number);
        picker.setMinValue(0);
        picker.setMaxValue(100);
        picker.setWrapSelectorWheel(true);
        int value =picker.getValue();

    }
}
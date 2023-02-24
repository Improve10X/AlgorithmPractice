package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityEqualityOfThreeValuesBinding;

public class EqualityOfThreeValuesActivity extends AppCompatActivity {

    ActivityEqualityOfThreeValuesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEqualityOfThreeValuesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Equality of three Values");
        equalityOfThreeValuesTask();
    }

    private void equalityOfThreeValuesTask() {
        binding.checkBtn.setOnClickListener(v -> {
            String text = binding.firstValueTxt.getText().toString();
            int firstValue = Integer.valueOf(text);
            String text1 = binding.secondValueTxt.getText().toString();
            int secondValue = Integer.valueOf(text1);
            String text2 = binding.thirdValueTxt.getText().toString();
            int thirdValue = Integer.valueOf(text2);
            int result = equalityValue(firstValue, secondValue, thirdValue);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();

        });
    }

    private static int equalityValue(int a, int b, int c) {
        int equalityValue = 0;
        if (a == b && b == c) {
            equalityValue = 3;
        } else if (a == b || b == c || c == a) {
            equalityValue = 2;
        } else {
            equalityValue = 0;
        }
        return equalityValue;
    }
}
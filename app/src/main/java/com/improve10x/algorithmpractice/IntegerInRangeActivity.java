package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityIntegerInRangeBinding;

public class IntegerInRangeActivity extends AppCompatActivity {

    ActivityIntegerInRangeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntegerInRangeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Integer In Range");
        integerInRangeTask();
    }

    private void integerInRangeTask() {
        binding.submit1Btn.setOnClickListener(v -> {
            String input = binding.inputTxt.getText().toString();
            int number = Integer.valueOf(input);
            String lowerBound = binding.lowerBoundTxt.getText().toString();
            int number1 = Integer.valueOf(lowerBound);
            String upperBound = binding.upperBoundTxt.getText().toString();
            int number2 = Integer.valueOf(upperBound);
            boolean result = integerInRange(number, number1, number2);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private static boolean integerInRange(int n, int a, int b) {
        boolean result = false;
        if (n >= a && n < b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.algorithmpractice.databinding.ActivityIsDivisibleByFiveBinding;

public class IsDivisibleByFive extends AppCompatActivity {

    ActivityIsDivisibleByFiveBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIsDivisibleByFiveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("isDivisibleByFive");
        divisibleBy5();
    }

    private void divisibleBy5() {
        binding.submitBtn.setOnClickListener(v -> {
            String num = binding.numberTxt.getText().toString();
            int number = Integer.valueOf(num);
            boolean result = isDivisibleByFive(number);
            String res = String.valueOf(result);
            binding.resultTxt.setText(res);
        });
    }

    private static boolean isDivisibleByFive(int n) {
        boolean result = false;
        if (n % 5 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityTwoMakesTenBinding;

public class TwoMakesTenActivity extends AppCompatActivity {

    ActivityTwoMakesTenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoMakesTenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Two Makes Ten");
        twoMakesTens();
    }

    private void twoMakesTens() {
        binding.submitBtn.setOnClickListener(v -> {
            String number = binding.number1Txt.getText().toString();
            int value = Integer.valueOf(number);
            String number2 = binding.number2Txt.getText().toString();
            int value2 = Integer.valueOf(number2);
            boolean result = twoMakesTen(value, value2);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private static boolean twoMakesTen(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityLessThenHundredBinding;

public class LessThenHundredActivity extends AppCompatActivity {

    ActivityLessThenHundredBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLessThenHundredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Less than 100");
        lessThenHundreds();
    }

    private void lessThenHundreds() {
        binding.submitBtn.setOnClickListener(v -> {
            String aValue = binding.aValueTxt.getText().toString();
            int number = Integer.valueOf(aValue);
            String bValue = binding.bValueTxt.getText().toString();
            int number2 = Integer.valueOf(bValue);
            boolean result = lessThenHundred(number, number2);
            binding.outputTxt.setText(String.valueOf(result));
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private static boolean lessThenHundred(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if (sum < 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
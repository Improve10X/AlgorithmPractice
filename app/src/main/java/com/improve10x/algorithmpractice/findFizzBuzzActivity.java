package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityFindFizzBuzzBinding;

public class findFizzBuzzActivity extends AppCompatActivity {

    ActivityFindFizzBuzzBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindFizzBuzzBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("FindFizzBuzz");
        findFizzBuzzOfNumbers();
    }

    private void findFizzBuzzOfNumbers() {
        binding.submitBtn.setOnClickListener(v -> {
            String number = binding.enterNumberTxt.getText().toString();
            int num = Integer.valueOf(number);
            String result = findFizzBuzz(num);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_LONG).show();
        });
    }

    private static String findFizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(n);
        }
        return result;
    }
}
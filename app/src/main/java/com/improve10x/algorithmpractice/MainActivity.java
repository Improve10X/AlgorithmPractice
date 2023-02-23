package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.algorithmpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        formBtn();
        nThEvenBtn();
        findDiscountBtn();
        isDivisibleByFive();
        findFizzBuzzBtn();
        lessThanHundred();
        twoMakesTen();
    }

    private void formBtn() {
        binding.formBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, FormActivity.class);
            startActivity(intent);

        });
    }

    private void nThEvenBtn() {
        binding.nthEvenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NevenActivity.class);
            startActivity(intent);
        });
    }

    private void findDiscountBtn() {
        binding.findDiscountBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindDiscountActivity.class);
            startActivity(intent);
        });
    }

    private void isDivisibleByFive() {
        binding.divisibleBy5Btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, IsDivisibleByFive.class);
            startActivity(intent);
        });
    }

    private void findFizzBuzzBtn() {
        binding.findFizzBuzzBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, findFizzBuzz.class);
            startActivity(intent);
        });
    }

    private void lessThanHundred() {
        binding.lessThenHundredBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, LessThenHundredActivity.class);
            startActivity(intent);
        });
    }

    private void twoMakesTen() {
        binding.twoMakesTenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoMakesTenActivity.class);
            startActivity(intent);
        });
    }
}
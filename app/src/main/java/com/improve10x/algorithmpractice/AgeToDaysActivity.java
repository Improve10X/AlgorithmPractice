package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.algorithmpractice.databinding.ActivityAgeToDaysBinding;

public class AgeToDaysActivity extends AppCompatActivity {

    ActivityAgeToDaysBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAgeToDaysBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Age to days");
        ageToDaysTask();
    }

    private void ageToDaysTask() {
        binding.submitBtn.setOnClickListener(v -> {
            String text = binding.ageTxt.getText().toString();
            int enteredText = Integer.valueOf(text);
            int result = ageToDays(enteredText);
            binding.ageResultTxt.setText(String.valueOf(result));
        });
    }

    private static int ageToDays(int age) {
        int days = 0;
        days = age * 365;
        return days;
    }
}
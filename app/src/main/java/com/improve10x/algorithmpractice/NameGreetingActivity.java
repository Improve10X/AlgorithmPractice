package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityNameGreetingBinding;

public class NameGreetingActivity extends AppCompatActivity {

    ActivityNameGreetingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNameGreetingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Name Greeting");
        nameGreetingTask();
    }

    private void nameGreetingTask() {
        binding.submitBtn.setOnClickListener(v -> {
            String text = binding.nameGreetingTxt.getText().toString();
            String result = nameGreeting(text);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private static String nameGreeting(String name) {
        try {
            String result = "Hello " + name + "!";
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
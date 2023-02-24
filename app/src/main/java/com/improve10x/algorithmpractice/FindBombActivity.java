package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.algorithmpractice.databinding.ActivityFindBomb2Binding;

public class FindBombActivity extends AppCompatActivity {

    ActivityFindBomb2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindBomb2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Find Bomb");
        findBombTask();
    }

    private void findBombTask() {
        binding.submitBtn.setOnClickListener(v -> {
            String text = binding.textTxt.getText().toString();
            String result = findBomb(text);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private static String findBomb(String text) throws NullPointerException {
        try {
            String result = "";
            String textInLowerCase = text.toLowerCase();
            if (textInLowerCase.contains("bomb")) {
                result = "DUCK!";
            } else {
                result = "Relax, There's no bomb.";
            }
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw  new NullPointerException();
        }
    }
}
package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.algorithmpractice.databinding.ActivityNthevenBinding;

public class NevenActivity extends AppCompatActivity {

    ActivityNthevenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNthevenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        nthEvenNumber();
    }

    private void nthEvenNumber() {
        binding.calculateBtn.setOnClickListener(v -> {
            String evenNumber = binding.evenNumberTxt.getText().toString();
            int nEvenNumber = Integer.parseInt(evenNumber);
            int nNumber = 2 * (nEvenNumber - 1);
            String number = String.valueOf(nNumber);
            binding.nthEvenNumberTxt.setText(number);
        });

    }
}
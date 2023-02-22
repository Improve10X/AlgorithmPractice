package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.algorithmpractice.databinding.ActivityFormBinding;

public class FormActivity extends AppCompatActivity {

    ActivityFormBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findTotalLegs();
    }

    private void findTotalLegs() {
        binding.countBtn.setOnClickListener(v -> {
           String chickensLegs =  binding.chickenLegsTxt.getText().toString();
           String buffaloLegs =  binding.bufellowLegsTxt.getText().toString();
           String cowLegs =  binding.cowLegsTxt.getText().toString();
           int chickenLeg = Integer.parseInt(chickensLegs);
           int buffaloLeg = Integer.parseInt(buffaloLegs);
           int cowLeg = Integer.parseInt(cowLegs);
           int noOfChickenLegs = chickenLeg * 2;
           int noOfBuffaloLeg = buffaloLeg * 4;
           int noOfCowLegs = cowLeg * 4;
           int totalLegs = noOfChickenLegs + noOfBuffaloLeg + noOfCowLegs;
           String totalNoOfLegs = String.valueOf(totalLegs);
           binding.totalLegsTxt.setText(totalNoOfLegs);
        });
    }
}
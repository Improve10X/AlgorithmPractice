package com.improve10x.algorithmpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.algorithmpractice.databinding.ActivityFindDiscountBinding;

public class FindDiscountActivity extends AppCompatActivity {

    ActivityFindDiscountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindDiscountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findDiscount();
    }

    private void findDiscount() {
        binding.calculateBtn.setOnClickListener(v -> {
            String price = binding.priceTxt.getText().toString();
            int number = Integer.parseInt(price);
            String discount = binding.discountTxt.getText().toString();
            int disc = Integer.parseInt(discount);
            double discountPrice = findTheDiscount(number, disc);
            String finalPrice = String.valueOf(discountPrice);
            binding.finalPriceTxt.setText(finalPrice);
        });
    }


    private static double findTheDiscount(int price, int percentage) {
        double finalPrice = 0;
        double discountAmount = price * percentage / 100;
        finalPrice = price - discountAmount;
        return finalPrice;
    }
}
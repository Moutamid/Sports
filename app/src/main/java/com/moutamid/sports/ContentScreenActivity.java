package com.moutamid.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.fxn.stash.Stash;
import com.moutamid.sports.databinding.ActivityContentScreenBinding;

public class ContentScreenActivity extends AppCompatActivity {
    ActivityContentScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContentScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Constants.checkApp(this);
        String lang = Stash.getString(Constants.Language);

        if (lang.equals("indo")){
            binding.sbImage.setImageResource(R.drawable.sport_betting_indo);
            binding.stImage.setImageResource(R.drawable.sport_tips_indo);
            binding.fbImage.setImageResource(R.drawable.football_betting_indo);
            binding.eaImage.setImageResource(R.drawable.europe_and_asia_indo);
        } else if (lang.equals("thailand")){
            binding.sbImage.setImageResource(R.drawable.sport_betting_thai);
            binding.stImage.setImageResource(R.drawable.sport_tips_thai);
            binding.fbImage.setImageResource(R.drawable.football_betting_thai);
            binding.eaImage.setImageResource(R.drawable.europe_and_asia_thai);
        } else {
            binding.sbImage.setImageResource(R.drawable.sport_betting_vitn);
            binding.stImage.setImageResource(R.drawable.sport_tips_vitn);
            binding.fbImage.setImageResource(R.drawable.football_betting_vitn);
            binding.eaImage.setImageResource(R.drawable.europe_and_asia_vitn);
        }

        binding.sportsBetting.setOnClickListener(v -> {
            Stash.put(Constants.selected, "sportsBetting");
            startActivity(new Intent(this, DetailScreenActivity.class));
        });

        binding.sportsTips.setOnClickListener(v -> {
            Stash.put(Constants.selected, "sportsTips");
            startActivity(new Intent(this, DetailScreenActivity.class));
        });

        binding.footballBetting.setOnClickListener(v -> {
            Stash.put(Constants.selected, "footballBetting");
            startActivity(new Intent(this, DetailScreenActivity.class));
        });

        binding.europeAsia.setOnClickListener(v -> {
            Stash.put(Constants.selected, "europeAsia");
            startActivity(new Intent(this, DetailScreenActivity.class));
        });

    }
}
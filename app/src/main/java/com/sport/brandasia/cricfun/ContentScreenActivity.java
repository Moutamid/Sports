package com.sport.brandasia.cricfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.fxn.stash.Stash;
import com.sport.brandasia.cricfun.databinding.ActivityContentScreenBinding;

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
            Stash.put(Constants.FROM, "Content");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });

        binding.sportsTips.setOnClickListener(v -> {
            Stash.put(Constants.selected, "sportsTips");
            Stash.put(Constants.FROM, "Content");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });

        binding.footballBetting.setOnClickListener(v -> {
            Stash.put(Constants.selected, "footballBetting");
            Stash.put(Constants.FROM, "Content");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });

        binding.europeAsia.setOnClickListener(v -> {
            Stash.put(Constants.selected, "europeAsia");
            Stash.put(Constants.FROM, "Content");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });

    }
}
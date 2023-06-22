package com.sport.brandasia.cricfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.fxn.stash.Stash;
import com.sport.brandasia.cricfun.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Constants.checkApp(this);

        binding.indo.setOnClickListener(v -> {
            Stash.put(Constants.Language, "indo");
            Stash.put(Constants.FROM, "Main");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });
        binding.vietnam.setOnClickListener(v -> {
            Stash.put(Constants.Language, "vietnam");
            Stash.put(Constants.FROM, "Main");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });
        binding.thailand.setOnClickListener(v -> {
            Stash.put(Constants.Language, "thailand");
            Stash.put(Constants.FROM, "Main");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });

    }
}
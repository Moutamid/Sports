package com.moutamid.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.fxn.stash.Stash;
import com.moutamid.sports.databinding.ActivityMainBinding;

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
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });
        binding.vietnam.setOnClickListener(v -> {
            Stash.put(Constants.Language, "vietnam");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });
        binding.thailand.setOnClickListener(v -> {
            Stash.put(Constants.Language, "thailand");
            startActivity(new Intent(this, AdScreenActivity.class));
            finish();
        });

    }
}
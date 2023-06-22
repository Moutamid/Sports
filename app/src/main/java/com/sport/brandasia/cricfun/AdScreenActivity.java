package com.sport.brandasia.cricfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;

import com.fxn.stash.Stash;
import com.sport.brandasia.cricfun.databinding.ActivityAdScreenBinding;

public class AdScreenActivity extends AppCompatActivity {

    ActivityAdScreenBinding binding;
// indo, thai, vitan
    String[] buttonText = {"Main\nsekarang", "เล่นเลย", "Bắt đầu\nchơi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        String lang = Stash.getString(Constants.Language);
        String from = Stash.getString(Constants.FROM);

        if (lang.equals("indo")){
            binding.linkText.setText(buttonText[0]);
            binding.imageView.setImageResource(R.drawable.indonesia_popup);
        } else if (lang.equals("thailand")){
            binding.linkText.setText(buttonText[1]);
            binding.imageView.setImageResource(R.drawable.tahlialnd_popup);
        } else {
            binding.linkText.setText(buttonText[2]);
            binding.imageView.setImageResource(R.drawable.vietnam_popup);
        }

        binding.close.setOnClickListener(v -> {
            if (from.equals("Main")) {
                Stash.put("back", false);
                startActivity(new Intent(this, ContentScreenActivity.class));
                finish();
            } else if (from.equals("Content")) {
                Stash.put("back", false);
                startActivity(new Intent(this, DetailScreenActivity.class));
                finish();
            } else {
                Stash.put("back", false);
                startActivity(new Intent(this, ContentScreenActivity.class));
                finish();
            }

        });


        binding.link.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://hometests.site/"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
            Stash.put("back", true);
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        String from = Stash.getString(Constants.FROM);
        if (Stash.getBoolean("back", false)){
            if (from.equals("Main")) {
                Stash.put("back", false);
                startActivity(new Intent(this, ContentScreenActivity.class));
                finish();
            } else if (from.equals("Content")) {
                Stash.put("back", false);
                startActivity(new Intent(this, DetailScreenActivity.class));
                finish();
            } else {
                Stash.put("back", false);
                startActivity(new Intent(this, ContentScreenActivity.class));
                finish();
            }
        }
    }
}
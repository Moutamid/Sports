package com.moutamid.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;

import com.fxn.stash.Stash;
import com.moutamid.sports.databinding.ActivityAdScreenBinding;

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
            startActivity(new Intent(this, ContentScreenActivity.class));
            finish();
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
        if (Stash.getBoolean("back", false)){
            Stash.put("back", false);
            startActivity(new Intent(this, ContentScreenActivity.class));
            finish();
        }
    }
}
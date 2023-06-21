package com.moutamid.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fxn.stash.Stash;
import com.moutamid.sports.databinding.ActivityDetailScreenBinding;

public class DetailScreenActivity extends AppCompatActivity {
    ActivityDetailScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String lang = Stash.getString(Constants.Language);
        String selected = Stash.getString(Constants.selected);

        if (lang.equals("indo")){
            getIndoDescription(selected);
        } else if (lang.equals("thailand")){
            getThaiDescription(selected);
        } else {
            getVitanimDescription(selected);
        }

    }

    private void getVitanimDescription(String selected) {
        if (selected.equals("sportsBetting")){
            binding.image.setImageResource(R.drawable.sport_betting_vitn);
            binding.description.setText("");
        } else if (selected.equals("sportsTips")){
            binding.image.setImageResource(R.drawable.sport_tips_vitn);
            binding.description.setText("");
        } else if (selected.equals("footballBetting")){
            binding.image.setImageResource(R.drawable.football_betting_vitn);
            binding.description.setText("");
        } else {
            binding.image.setImageResource(R.drawable.europe_and_asia_vitn);
            binding.description.setText("");
        }
    }

    private void getThaiDescription(String selected) {
        if (selected.equals("sportsBetting")){
            binding.image.setImageResource(R.drawable.sport_betting_thai);
            binding.description.setText("");
        } else if (selected.equals("sportsTips")){
            binding.image.setImageResource(R.drawable.sport_tips_thai);
            binding.description.setText("");
        } else if (selected.equals("footballBetting")){
            binding.image.setImageResource(R.drawable.football_betting_thai);
            binding.description.setText("");
        } else {
            binding.image.setImageResource(R.drawable.europe_and_asia_thai);
            binding.description.setText("");
        }
    }

    private void getIndoDescription(String selected) {
        if (selected.equals("sportsBetting")){
            binding.image.setImageResource(R.drawable.sport_betting_indo);
            String des = getResources().getString(R.string.W88_review_indo) + getResources().getString(R.string.Fun88_Review_indo) +
                    getResources().getString(R.string.Review_vwin_indo) + getResources().getString(R.string.FB9_review_indo) +
                    getResources().getString(R.string.M88_review_indo) + getResources().getString(R.string.Betway_review_indo);
            binding.description.setText(des);
        } else if (selected.equals("sportsTips")){
            binding.image.setImageResource(R.drawable.sport_tips_indo);
            binding.description.setText("");
        } else if (selected.equals("footballBetting")){
            binding.image.setImageResource(R.drawable.football_betting_indo);
            binding.description.setText("");
        } else {
            binding.image.setImageResource(R.drawable.europe_and_asia_indo);
            binding.description.setText("");
        }
    }
}
package com.sport.brandasia.cricfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.fxn.stash.Stash;
import com.sport.brandasia.cricfun.databinding.ActivityDetailScreenBinding;

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
            String des = getResources().getString(R.string.W88_review_vitenam) + getResources().getString(R.string.Fun88_Review_vitenam) +
                    getResources().getString(R.string.Review_vwin_vitenam) + getResources().getString(R.string.FB9_review_vitenam) +
                    getResources().getString(R.string.M88_review_vitenam) + getResources().getString(R.string.Betway_review_vitenam);
            binding.description.setText(des);
        } else if (selected.equals("sportsTips")){
            binding.image.setImageResource(R.drawable.sport_tips_vitn);
            String des = getResources().getString(R.string.sport_tips_vitenam);
            binding.description.setText(des);
        } else if (selected.equals("footballBetting")){
            binding.image.setImageResource(R.drawable.football_betting_vitn);
            String des = getResources().getString(R.string.football_betting_vitenam);
            binding.description.setText(des);
        } else {
            binding.image.setImageResource(R.drawable.europe_and_asia_vitn);
            String des = getResources().getString(R.string.europe_asia_vitenam);
            binding.description.setText(des);
        }
    }

    private void getThaiDescription(String selected) {
        if (selected.equals("sportsBetting")){
            binding.image.setImageResource(R.drawable.sport_betting_thai);
            String des = getResources().getString(R.string.W88_review_thai) + getResources().getString(R.string.Fun88_Review_thai) +
                    getResources().getString(R.string.Review_vwin_thai) + getResources().getString(R.string.FB9_review_thai) +
                    getResources().getString(R.string.M88_review_thai) + getResources().getString(R.string.Betway_review_thai);
            binding.description.setText(des);
        } else if (selected.equals("sportsTips")){
            binding.image.setImageResource(R.drawable.sport_tips_thai);
            String des = getResources().getString(R.string.sport_tips_thai);
            binding.description.setText(des);
        } else if (selected.equals("footballBetting")){
            binding.image.setImageResource(R.drawable.football_betting_thai);
            String des = getResources().getString(R.string.football_betting_thai);
            binding.description.setText(des);
        } else {
            binding.image.setImageResource(R.drawable.europe_and_asia_thai);
            String des = getResources().getString(R.string.europe_asia_thai);
            binding.description.setText(des);
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
            String des = getResources().getString(R.string.sport_tips_indo);
            binding.description.setText(des);
        } else if (selected.equals("footballBetting")){
            binding.image.setImageResource(R.drawable.football_betting_indo);
            String des = getResources().getString(R.string.football_betting_indo);
            binding.description.setText(des);
        } else {
            binding.image.setImageResource(R.drawable.europe_and_asia_indo);
            String des = getResources().getString(R.string.europe_asia_indo);
            binding.description.setText(des);
        }
    }

    @Override
    public void onBackPressed() {
        Stash.put(Constants.FROM, "Detail");
        startActivity(new Intent(this, AdScreenActivity.class));
        finish();
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // define viewBinding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();
        super.onCreate(savedInstanceState);





        setContentView(view);
    }

}
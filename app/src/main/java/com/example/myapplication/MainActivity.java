package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(v->{
            String szoveg ="Input szöveg: " + binding.editText.getText().toString();
            binding.txt.setText(szoveg);
        });

        binding.button2.setOnClickListener(v->{
            binding.txt.setText("Kettes gomb megnyomva");
        });
    }
}
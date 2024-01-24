package com.example.lab01a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab01a.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String[] storySelection = getResources().getStringArray(R.array.story_selection);

        binding.generatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int randomNumber = (int)((Math.random() * 22) + 1);
                TextView t = binding.output;
                String text = storySelection[randomNumber];
                t.setText(text);
            }
        });
    }
}
package com.example.tugas_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonLihat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLihat = findViewById(R.id.buttonLihat);
        buttonLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button rules
            }
        });
    }
}
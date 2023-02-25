package com.example.tugas_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonLihat;
    private boolean kelebihanIsShown = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLihat = findViewById(R.id.buttonLihat);
        displayDefault();
        buttonLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!kelebihanIsShown){
                    displayKelebihan();
                }
                else {
                    closeKelebihan();
                }
            }
        });
    }

    private void closeKelebihan() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new konten());
        fragmentTransaction.commit();

        buttonLihat.setText("Lihat Kelebihan");
        kelebihanIsShown = false;
    }

    private void displayKelebihan() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new KontenKelebihan());
        fragmentTransaction.commit();

        buttonLihat.setText("Mantap!");
        kelebihanIsShown = true;
    }

    private void displayDefault(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new konten());
        fragmentTransaction.commit();
    }
}
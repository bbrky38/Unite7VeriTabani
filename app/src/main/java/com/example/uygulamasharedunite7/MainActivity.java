package com.example.uygulamasharedunite7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnUnite7(View view) {
        Intent uyg = new Intent(MainActivity.this, Uygulama1Activity.class);
        startActivity(uyg);
    }
}
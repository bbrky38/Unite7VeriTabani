package com.example.uygulamasharedunite7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Uygulama2Activity extends AppCompatActivity {
    RadioButton radioAcikTema, radioKapaliTema;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama2_activity);

        radioAcikTema = findViewById(R.id.radioAcikTema);
        radioKapaliTema = findViewById(R.id.radioKoyuTema);

        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        String data = sharedPreferences.getString("tema","kapali");
        if(data == "kapali") AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        else if (data == "acik") AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

    }

    public void 
}
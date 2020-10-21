package com.example.mascotas.Menus;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mascotas.R;

public class ActivityAbout extends AppCompatActivity {
    TextView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
}

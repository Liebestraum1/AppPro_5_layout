package com.example.apppro_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt_launch_onclick(View v) {
        FrameLayout layout = findViewById(R.id.layout);

        Button bt = new Button(this);

        layout.addView(bt);
    }
}
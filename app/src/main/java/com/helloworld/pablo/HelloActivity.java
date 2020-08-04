package com.helloworld.pablo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        String msg = getIntent().getStringExtra("msgHello");

        TextView tvHello = findViewById(R.id.tvHello);
        tvHello.setText(msg);
    }
}

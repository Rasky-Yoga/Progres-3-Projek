package com.example.drivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {

    Button button_mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        button_mulai = findViewById(R.id.get_started_button);
        button_mulai.setOnClickListener(view -> {

            Intent mulai = new Intent(GetStarted.this, SelamatDatang.class);
            startActivity(mulai);
        });

    }
}
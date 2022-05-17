package com.example.drivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LupaPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        TextView email = findViewById(R.id.input_email);

        Button btnNext = findViewById(R.id.button_next);
        Button btnBack = findViewById(R.id.back_arrow_top_reset);


        btnNext.setOnClickListener(v -> {
            if(email.getText().toString().equals("reset@demo.com")){
                // email telah diisi
                Toast.makeText(LupaPassword.this, "Link telah dikirim ke email", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LupaPassword.this, Login.class));

            } else
                // email belum diisi
                Toast.makeText(LupaPassword.this, "Silakan masukkan email", Toast.LENGTH_SHORT).show();
        });



        btnBack.setOnClickListener(v -> {

            Intent intent = new Intent(LupaPassword.this, Login.class);
            startActivity(intent);

        });

    }
}
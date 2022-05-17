package com.example.drivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView email = findViewById(R.id.input_email);
        TextView password = findViewById(R.id.input_password);
        TextView lupaPassword = findViewById(R.id.lupa_password);

        Button btnNext = findViewById(R.id.button_next);
        Button btnBack = findViewById(R.id.back_arrow_top_login);


        // demo@demo.com & demo1234

         btnNext.setOnClickListener(v -> {

            if(email.getText().toString().equals("demo@demo.com") && password.getText().toString().equals("demo1234")){
                // email & password benar
                Toast.makeText(Login.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login.this, MainActivity.class));

            } else
                // email & password salah
                Toast.makeText(Login.this, "Maaf, email atau password salah", Toast.LENGTH_SHORT).show();
            });


        // ke halaman reset password

        lupaPassword.setOnClickListener(v1 -> {
            Intent intent = new Intent(Login.this, LupaPassword.class);
            startActivity(intent);
        });

        // kembali ke halaman login

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, SelamatDatang.class);
            startActivity(intent);
        });

    }
}
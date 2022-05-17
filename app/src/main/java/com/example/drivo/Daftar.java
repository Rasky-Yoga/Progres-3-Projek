package com.example.drivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Daftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);


        TextView nama = findViewById(R.id.input_nama_daftar);
        TextView email = findViewById(R.id.input_email_daftar);
        TextView noTelp = findViewById(R.id.input_no_telp_daftar);


        Button btnBack = findViewById(R.id.back_arrow_top_daftar);
        Button btnDaftar = findViewById(R.id.button_daftar);


        // ke halaman login

        btnDaftar.setOnClickListener(v -> {

            if(nama.getText().toString().length() != 0 && email.getText().toString().length() != 0 && noTelp.getText().toString().length() != 0  ){
                Toast.makeText(Daftar.this, "Pendaftaran berhasil", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Daftar.this, Login.class);
                startActivity(intent);
            } else
                Toast.makeText(Daftar.this, "Silakan lengkapi data anda", Toast.LENGTH_SHORT).show();
        });


        // kembali ke halaman selamat datang

        btnBack.setOnClickListener(v -> {

            Intent intent = new Intent(Daftar.this, SelamatDatang.class);
            startActivity(intent);
        });
    }
}
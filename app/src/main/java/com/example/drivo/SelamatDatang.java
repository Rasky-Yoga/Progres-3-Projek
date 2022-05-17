package com.example.drivo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.Button;
import android.widget.TextView;

import com.example.drivo.adapter.ViewAdapter;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

public class SelamatDatang extends AppCompatActivity {

    ViewPager viewPager;
    SpringDotsIndicator dotsIndicator;
    ViewAdapter viewAdapter;

    Button btnMasuk;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamat_datang);

        viewPager = findViewById(R.id.on_boarding_container);
        dotsIndicator = findViewById(R.id.login_dots_indicator);

        viewAdapter = new ViewAdapter(this);
        viewPager.setAdapter(viewAdapter);
        dotsIndicator.setViewPager(viewPager);


        // Ubah warna font

        TextView textView = findViewById(R.id.terms_of_service_text);
        String text = "Dengan masuk atau mendaftar, anda menyetujui " +
                "Terms of service dan Privacy policy kami.";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsPurple = new ForegroundColorSpan(getColor(R.color.purple));
        StyleSpan boldText =  new StyleSpan(Typeface.BOLD);

        ss.setSpan(fcsPurple, 46, 80,  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldText, 46, 80, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);


        // Masuk & Daftar

        btnMasuk = findViewById(R.id.button_masuk);
        btnDaftar = findViewById(R.id.button_daftar);

        btnMasuk.setOnClickListener(view -> {

            Intent mulai = new Intent(SelamatDatang.this, Login.class);
            startActivity(mulai);

    });

        btnDaftar.setOnClickListener(view -> {

            Intent daftar = new Intent(SelamatDatang.this, Daftar.class);
            startActivity(daftar);

        });

    }
}

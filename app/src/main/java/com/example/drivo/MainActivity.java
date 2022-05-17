package com.example.drivo;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.drivo.fragment.FavoriteFragment;
import com.example.drivo.fragment.HomeFragment;
import com.example.drivo.fragment.NotificationFragment;
import com.example.drivo.fragment.SettingsFragment;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {

    AnimatedBottomBar animatedBottomBar;
    FragmentManager fragmentManager;

    HomeFragment homeFragment = new HomeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animatedBottomBar = findViewById(R.id.animatedBottomBar);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();

        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastTab,
                                      int newIndex, @NonNull AnimatedBottomBar.Tab newTab) {

                Fragment fragment = null;
                switch (newTab.getId()){

                    case R.id.home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.favorite:
                        fragment = new FavoriteFragment();
                        break;

                    case R.id.notification:
                        fragment = new NotificationFragment();
                        break;

                    case R.id.settings:
                        fragment = new SettingsFragment();
                        break;
                }

                if (fragment!=null) {
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                }

            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {}

        });
    }
}
package com.example.hrapp;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize buttons
        Button myProfileButton = findViewById(R.id.myProfile_btn);
        Button holidaysButton = findViewById(R.id.holidays_btn);
        Button settingsButton = findViewById(R.id.settings_btn);
        ImageButton homeButton = findViewById(R.id.home_Btn);
        ImageButton menuButton = findViewById(R.id.menu_Btn);

        // My Profile button
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MenuActivity.this, MyProfile.class, false);
            }
        });

        // Holidays button
        holidaysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MenuActivity.this, HolidayMenu.class, false);
            }
        });

        // Settings button
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to SettingsActivity if added
                //NavigationUtils.navigateToActivity(MenuActivity.this, SettingsActivity.class, false);
            }
        });

        // Home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MenuActivity.this, homeScreen.class, false);
            }
        });

        // Menu button
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MenuActivity.this, MenuActivity.class, false);
            }
        });
    }
}
package com.example.hrapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HolidayMenu extends AppCompatActivity {

    private Button requestButton;
    private Button viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_holiday_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize buttons
        ImageButton homeButton = findViewById(R.id.home_Btn);
        ImageButton menuButton = findViewById(R.id.menu_Btn);
        requestButton = findViewById(R.id.requestButton);
        viewButton = findViewById(R.id.viewButton);

        // Request button
        requestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the HolidayRequestActivity
                NavigationUtils.navigateToActivity(HolidayMenu.this, HolidayRequest.class, false);
            }
        });

        // Cancel button
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HolidayMenu.this, "Holiday Cancelled", Toast.LENGTH_SHORT).show();
            }
        });

        // Home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(HolidayMenu.this, homeScreen.class, false);
            }
        });

        // Menu button
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(HolidayMenu.this, MenuActivity.class, false);
            }
        });
    }
}

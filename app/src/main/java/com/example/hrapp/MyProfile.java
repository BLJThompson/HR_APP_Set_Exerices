package com.example.hrapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;


public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Example data
        TextView firstNameTextView = findViewById(R.id.firstName);
        firstNameTextView.setText("John");
        TextView lastNameTextView = findViewById(R.id.lastName);
        lastNameTextView.setText("Doe");



        ImageButton homeButton = findViewById(R.id.home_Btn);
        ImageButton menuButton = findViewById(R.id.menu_Btn);
        Button editButton = findViewById(R.id.editButton);

        // Home button
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MyProfile.this, homeScreen.class, false);
            }
        });

        // Menu button
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MyProfile.this, MenuActivity.class, false);
            }
        });

        // Edit button
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtils.navigateToActivity(MyProfile.this, EditEmeployeeDetails.class, false);
            }
        });
    }
}
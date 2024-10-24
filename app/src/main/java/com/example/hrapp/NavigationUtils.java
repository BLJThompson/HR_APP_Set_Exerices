package com.example.hrapp;

import android.app.Activity;
import android.content.Intent;
public class NavigationUtils {

    // Static method to be reused across the app for navigation
    public static void navigateToActivity(Activity currentActivity, Class<?> targetActivity, boolean shouldFinishCurrent) {
        Intent intent = new Intent(currentActivity, targetActivity);
        currentActivity.startActivity(intent);

        // Optionally finish the current activity
        if (shouldFinishCurrent) {
            currentActivity.finish();
        }
    }
}
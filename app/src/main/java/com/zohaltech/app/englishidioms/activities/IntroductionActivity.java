package com.zohaltech.app.englishidioms.activities;

import android.support.v7.app.ActionBar;

import com.zohaltech.app.englishidioms.R;


public class IntroductionActivity extends EnhancedActivity {

    @Override
    protected void onCreated() {
        setContentView(R.layout.activity_introduction);
    }

    @Override
    protected void onToolbarCreated() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Introduction");
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
    }
}
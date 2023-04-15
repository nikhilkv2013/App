package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TimeBlocksActivity extends AppCompatActivity {
    int startTime;
    int endTime;

    TimeBlocksActivity(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_blocks);
    }
}
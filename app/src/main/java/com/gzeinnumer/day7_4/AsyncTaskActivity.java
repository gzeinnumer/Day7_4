package com.gzeinnumer.day7_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gzeinnumer.day7_4.databinding.ActivityAsyncTaskBinding;

public class AsyncTaskActivity extends AppCompatActivity {
    private ActivityAsyncTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
    }
}
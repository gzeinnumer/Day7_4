package com.gzeinnumer.day7_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.day7_4.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    private ActivityDashboardBinding binding; //kosong binding =
    String userToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        userToken = SessionManagerUtil.getInstance().getUserToken(getApplicationContext());
        Toast.makeText(getApplicationContext(), userToken, Toast.LENGTH_SHORT).show();

        binding.btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SessionManagerUtil.getInstance().endUserSession(getApplicationContext());
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();

            }
        });
    }
}
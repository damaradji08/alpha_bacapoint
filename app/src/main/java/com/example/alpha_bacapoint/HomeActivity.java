package com.example.alpha_bacapoint;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewWelcome = findViewById(R.id.textViewWelcome);

        // Menerima data dari Intent
        Intent intent = getIntent();
        String email = intent.getStringExtra("USER_EMAIL");

        // Menampilkan pesan selamat datang
        textViewWelcome.setText("Selamat datang, " + email + "!");
    }
}

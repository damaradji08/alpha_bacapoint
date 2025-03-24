package com.example.alpha_bacapoint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.button4);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                // Simulasi validasi login (email & password tidak boleh kosong)
                if (!email.isEmpty() && !password.isEmpty()) {
                    // Intent untuk berpindah ke HomeActivity
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    intent.putExtra("USER_EMAIL", email);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Email dan Password harus diisi!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

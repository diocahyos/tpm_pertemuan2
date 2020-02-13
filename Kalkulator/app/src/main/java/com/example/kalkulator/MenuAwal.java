package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuAwal extends AppCompatActivity {

    private Button btnKelilingL, btnLuasL;
    private TextView tvHasil;
    private EditText etPanjang, etLebar, etTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);

        btnKelilingL = findViewById(R.id.btnKelilingLingkaran);
        btnLuasL = findViewById(R.id.btnLuasLingkaran);

        btnKelilingL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), KelilingLingkaran.class);
                    startActivity(intent);
            }
        });

        btnLuasL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LuasLingkaran.class);
                startActivity(intent);
            }
        });

    }
}

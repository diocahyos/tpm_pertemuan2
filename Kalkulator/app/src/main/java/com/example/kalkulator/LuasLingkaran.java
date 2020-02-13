package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasLingkaran extends AppCompatActivity {

    private Button btnHasil, btnBack;
    private TextView tvHasil;
    private EditText etJari;
    final Double phi = 3.14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        btnHasil = findViewById(R.id.btnHasil);
        etJari = findViewById(R.id.etJari);
        tvHasil = findViewById(R.id.tvHasil);
        btnBack = findViewById(R.id.btnBack);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Jari = Double.parseDouble(etJari.getText().toString());

                    Double Luas = phi * Jari * Jari;

                    tvHasil.setText(String.valueOf(Luas));
                }catch (NumberFormatException ntf){
                    Toast.makeText(getApplicationContext(),"Maaf Nilai Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuAwal.class);
                startActivity(intent);
            }
        });
    }
}

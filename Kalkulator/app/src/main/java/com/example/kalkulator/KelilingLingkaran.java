package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingLingkaran extends AppCompatActivity {

    private TextView tvHasil;
    private Button btnHasil, btnBack;
    private EditText etJari;
    final Double phi = 3.14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);

        tvHasil = findViewById(R.id.tvHasil);
        btnHasil = findViewById(R.id.btnHasil);
        etJari = findViewById(R.id.etJari);
        btnBack = findViewById(R.id.btnBack);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Jari = Double.parseDouble(etJari.getText().toString());

                    Double Keliling = 2 * phi * Jari;

                    tvHasil.setText(String.valueOf(Keliling));
                }catch (NumberFormatException nft){
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

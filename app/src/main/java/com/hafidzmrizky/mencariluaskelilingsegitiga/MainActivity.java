package com.hafidzmrizky.mencariluaskelilingsegitiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button BtnKeliling, BtnLuas, BtnHitung;

    TextView TVhasil;

    EditText ETtinggi, ETsisiA, ETsisiB, ETsisiC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETtinggi = findViewById(R.id.tinggi);
        ETsisiA = findViewById(R.id.sisiA);
        ETsisiB = findViewById(R.id.sisiB);
        ETsisiC = findViewById(R.id.sisiC);
        TVhasil = findViewById(R.id.Hasil);
        BtnHitung = findViewById(R.id.Bhitung);
        BtnLuas = findViewById(R.id.Bluas);
        BtnKeliling = findViewById(R.id.Bkeliling);

        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, c, d;
                double hitung;

                if (!ETtinggi.getText().toString().isEmpty()){
                    a = Integer.parseInt(ETsisiA.getText().toString());
                    d = Integer.parseInt(ETtinggi.getText().toString());
                    hitung = 0.5 * a * d;
                    TVhasil.setText(hitung+"");
                }else {
                    try {
                        if (!ETsisiA.getText().toString().isEmpty() || ETsisiB.getText().toString().isEmpty() || ETsisiC.getText().toString().isEmpty()) {
                            a = Integer.parseInt(ETsisiA.getText().toString());
                            b = Integer.parseInt(ETsisiB.getText().toString());
                            c = Integer.parseInt(ETsisiC.getText().toString());
                            hitung = a + b + c;
                            TVhasil.setText(hitung + "");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETsisiA.setText("");
                ETsisiB.setText("");
                ETsisiC.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.VISIBLE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.GONE);
                ETsisiC.setVisibility(view.GONE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETsisiA.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.GONE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.VISIBLE);
                ETsisiC.setVisibility(view.VISIBLE);
            }
        });

    }
}
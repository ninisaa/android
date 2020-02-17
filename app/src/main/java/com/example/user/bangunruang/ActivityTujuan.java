package com.example.user.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTujuan extends AppCompatActivity {
    private EditText sisiKubus;
    private Button btnVolumeKubus;
    private TextView hasilVolumeKubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);

        sisiKubus = findViewById(R.id.sisiKubus);
        btnVolumeKubus = findViewById(R.id.btnVolumeKubus);
        hasilVolumeKubus = findViewById(R.id.hasilVolumeKubus);
        btnVolumeKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSisi = sisiKubus.getText().toString();

                    double sisi = Double.parseDouble(sSisi);
                    double volumeKubus = sisi * sisi * sisi;
                    String svolumeKubus = String.valueOf(volumeKubus);
                    hasilVolumeKubus.setText(svolumeKubus);
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Nol", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

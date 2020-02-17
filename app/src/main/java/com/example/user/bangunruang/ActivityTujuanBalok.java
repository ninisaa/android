package com.example.user.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTujuanBalok extends AppCompatActivity {
    private Button btnVolumeBalok;
    private EditText panjangBalok, lebarBalok, tinggiBalok;
    private TextView hasilVolumeBalok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan_balok);

        panjangBalok = findViewById(R.id.panjangBalok);
        lebarBalok = findViewById(R.id.lebarBalok);
        tinggiBalok = findViewById(R.id.tinggiBalok);
        btnVolumeBalok = findViewById(R.id.btnVolumeBalok);
        hasilVolumeBalok = findViewById(R.id.hasilVolumeBalok);

        btnVolumeBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String spanjangBalok = panjangBalok.getText().toString();
                    String slebarBalok = lebarBalok.getText().toString();
                    String stinggiBalok = tinggiBalok.getText().toString();

                    double panjang = Double.parseDouble(spanjangBalok);
                    double lebar = Double.parseDouble(slebarBalok);
                    double tinggi = Double.parseDouble(stinggiBalok);

                    double volumeBalok = panjang*lebar*tinggi;

                    String svolumeBalok = String.valueOf(volumeBalok);
                    hasilVolumeBalok.setText(svolumeBalok);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field tidak boleh nol", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}

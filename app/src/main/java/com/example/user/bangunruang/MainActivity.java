package com.example.user.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnKubus, btnBalok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKubus = findViewById(R.id.btnKubus);
        btnBalok = findViewById(R.id.btnBalok);
        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this, ActivityTujuan.class);
                startActivity(moveIntent);
            }
        });
        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                Intent move = new Intent(MainActivity.this, ActivityTujuanBalok.class);
                startActivity(move);
            }
        });
    }
}

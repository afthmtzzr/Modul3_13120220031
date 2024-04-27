package com.example.modul3_13120220031;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView txtStb;
    private TextView txtNama;
    private TextView txtAng;
    private TextView txtProdi;
    private TextView txtMinat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtStb = findViewById(R.id.txt_stb);
        txtNama = findViewById(R.id.txt_nama);
        txtAng = findViewById(R.id.txt_akt);
        txtProdi = findViewById(R.id.txt_prodi);
        txtMinat = findViewById(R.id.txt_minat);

        Bundle bundle = getIntent().getExtras();

            String stambuk = bundle.getString("stambuk");
            String nama = bundle.getString("nama");
            String angkatan = bundle.getString("angkatan");
            String programStudi = bundle.getString("programStudi");
            String minat = bundle.getString("minat");

            txtStb.setText(stambuk);
            txtNama.setText(nama);
            txtAng.setText(angkatan);
            txtProdi.setText(programStudi);
            txtMinat.setText(minat);

    }
    public void tutupClick(View view){
        finish();
    }
}

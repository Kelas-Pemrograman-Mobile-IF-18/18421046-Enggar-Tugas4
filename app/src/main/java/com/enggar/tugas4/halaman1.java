package com.enggar.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class halaman1 extends AppCompatActivity {
    @BindView(R.id.edtNama) EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        ButterKnife.bind(this);

    }
    @OnClick(R.id.btnPindah) void pindah () {
        String nama = edtNama.getText().toString();
        Intent i = new Intent(halaman1.this, halaman2.class);
        i.putExtra("nama", nama);
        startActivity(i);
        finish();
    }
}
package com.gdeaditya.eventku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageView gambar;
    TextView tanggal, judul, lokasi, kategori;
    SharedPreferences Pref;
    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambar = (ImageView) findViewById(R.id.gambar1);
        tanggal = (TextView) findViewById(R.id.txTanggal);
        judul = (TextView) findViewById(R.id.txjudul);
        kategori = (TextView) findViewById(R.id.txKategori);
        lokasi = (TextView) findViewById(R.id.txlokasi);
        Pref = getSharedPreferences("Pref", MODE_PRIVATE);
        edit = Pref.edit();

    }

    public void ubah1(View v) {
        gambar.setImageResource(R.drawable.bg_event2);
        tanggal.setText("12 Desember 2016");
        judul.setText("Pertemuan Ke 3");
        kategori.setText("Membahas Koding");
        lokasi.setText("Margonda Lt1");
    }

    public void ubah2(View v) {
        gambar.setImageResource(R.drawable.bg_event3);
        tanggal.setText("13 Desember 2016");
        judul.setText("Pertemuan Ke 4");
        kategori.setText("Membahas Java");
        lokasi.setText("Margonda Lt2");
    }

    public void ubah3(View v) {
        gambar.setImageResource(R.drawable.bg_event);
        tanggal.setText("14 Desember 2016");
        judul.setText("Pertemuan Ke 5");
        kategori.setText("Membahas Java");
        lokasi.setText("Margonda Lt2");
    }

    public void Logout (View v) {
        edit.putBoolean("KeepLogin",false);
        edit.commit();
        Intent i = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
        finish();
    }

}

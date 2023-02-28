package com.example.papb_lifecycleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("state", "On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("state", "On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("state", "On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("state", "On Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("state", "On Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("state", "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("state", "On Destroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Kelas", "PAPB-A");
        Log.d("state", "Save State");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("state","Restore State");
        String teksKelas = savedInstanceState.getString("Kelas");
        TextView teksHello = this.findViewById(R.id.teksHello);
        teksHello.setText(teksKelas);
    }
}
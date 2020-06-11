package com.example.androidexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {

    int phaseChangeCount = 0;

    void showMessage(String message){
        phaseChangeCount ++;

        Toast.makeText(this, "La actividad se ha " + message + "\nNumero de cambios: " + phaseChangeCount, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        showMessage("creado");
    }


    @Override
    protected void onStart() {
        super.onStart();

        showMessage("iniciado");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showMessage("pausado");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showMessage("resumido");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showMessage("reiniciado");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showMessage("detenido");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showMessage("destruido");
    }
}
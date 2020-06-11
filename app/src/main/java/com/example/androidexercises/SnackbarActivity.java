package com.example.androidexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class SnackbarActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimple_Snackbar:
                break;

            case R.id.btnCustom_Snackbar:

        }
    }
}
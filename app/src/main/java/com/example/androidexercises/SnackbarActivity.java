package com.example.androidexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class SnackbarActivity extends AppCompatActivity implements View.OnClickListener {

    View coordinatorLayOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

         coordinatorLayOut = findViewById(R.id.cltContent_Snack);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimple_Snackbar:
                Snackbar.make(coordinatorLayOut, "Snackbar básico", Snackbar.LENGTH_LONG).show();
                break;

            case R.id.btnCustom_Snackbar:
                Snackbar actionSnackbar = Snackbar.make(coordinatorLayOut, "Snackbar personalizado", Snackbar.LENGTH_LONG);
                View actionSnackbarView = actionSnackbar.getView();
                //TextView snackbarText = actionSnackbarView.findViewById()
                actionSnackbar.show();
                break;

            case R.id.btnAction_Snackbar:
                Snackbar.make(coordinatorLayOut, "Snackbar con accion", Snackbar.LENGTH_SHORT).
                    setAction("Change", new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                            Snackbar change = Snackbar.make(coordinatorLayOut, "Cambiar", Snackbar.LENGTH_SHORT);
                            change.show();
                            View snackbarView = change.getView();
                            snackbarView.setBackgroundColor(Color.GRAY);
                        }
                    }).show();
                break;
        }
    }
}
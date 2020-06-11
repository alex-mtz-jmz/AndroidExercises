package com.example.androidexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.net.URI;

public class IntentsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
    }

    @Override
    public void onClick(View v) {
        Intent implicitIntent;

        switch (v.getId()){
            case R.id.btnCall_Intent:
                Toast.makeText(this, "Llamar", Toast.LENGTH_LONG).show();
                implicitIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:4612609941"));
                startActivity(implicitIntent);
                break;

            case R.id.btnSMS_Intent:
                Toast.makeText(this, "Enviar mensaje", Toast.LENGTH_LONG).show();
                implicitIntent = new Intent(Intent.ACTION_SENDTO);
                implicitIntent.setData(Uri.parse("smsto:"));
                implicitIntent.putExtra("sms_body", "Mensaje de prueba");
                startActivity(implicitIntent);
                break;

            case R.id.btnEmail_Intent:
                Toast.makeText(this, "Enviar correo", Toast.LENGTH_LONG).show();
                implicitIntent = new Intent(Intent.ACTION_SEND);
                //implicitIntent.setType("*/*");
                implicitIntent.setData(Uri.parse("mailto:"));
                implicitIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"ale.mtz.jmz@gmail.com"});
                implicitIntent.putExtra(Intent.EXTRA_SUBJECT, "Prueba");
                startActivity(implicitIntent);
                break;

            case R.id.btnWebSite_Intent:
                Toast.makeText(this, "Abrir sitio", Toast.LENGTH_LONG).show();
                implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(implicitIntent);
                break;
        }
    }
}
package com.example.androidexercises;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intencion;

        switch (item.getItemId()){
            case R.id.itemLifeCycle_main:
                intencion = new Intent(this, LifeCycleActivity.class);
                startActivity(intencion);

            case R.id.itemIntents_main:
                intencion = new Intent(this, IntentsActivity.class);
                startActivity(intencion);
        }

        return super.onOptionsItemSelected(item);
    }
}
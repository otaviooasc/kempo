package com.karate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_golpes = findViewById(R.id.btn_golpes);
        final Button btn_kata = findViewById(R.id.btn_kata);
        final Intent activityGolpes = new Intent(this, ActivityGolpes.class);

        btn_golpes.setOnClickListener(view -> {
            startActivity(activityGolpes);
            Toast.makeText(getApplicationContext(), "Oss!", Toast.LENGTH_SHORT).show();
        });

        btn_kata.setOnClickListener(view -> {
            Snackbar.make(view, "Aguarde as próximas atualizações!", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();
        });
    }
}
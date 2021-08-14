package com.karate;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class ActivityGolpes extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] nameListGolpes = {
            "Gedan Barai", "Jodan Age Uke", "Jodan Juji Uke",
            "Shuto Uke", "Soto Uke", "Uchi Uke"
    };
    String[] descriptionListGolpes = {
            "Varrer \"embaixo\"", "Defesa Ascendente", "Desefesa cruzada",
            "Defesa com a faca da mão", "Defesa circular", "Puxar o punhal"
    };
    int[] imageListGolpes = {
            R.drawable.gedan_barai, R.drawable.jodan_age_uke,
            R.drawable.juji_uke, R.drawable.shuto_uke, R.drawable.soto_uke, R.drawable.uchi_uke
    };

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golpes);
        recyclerView = findViewById(R.id.activityListGolpes);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ProgramAdapter programAdapter = new ProgramAdapter(this, nameListGolpes,
                descriptionListGolpes, imageListGolpes);
        recyclerView.setAdapter(programAdapter);

        Intent intent = new Intent(this, ActivityExecucaoGolpes.class);

        if(!Objects.isNull(programAdapter.golpes)){
            intent.putExtra("golpes", programAdapter.golpes);
            startActivity(intent);
        }
    }
}
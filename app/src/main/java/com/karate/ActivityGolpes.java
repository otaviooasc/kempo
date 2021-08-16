package com.karate;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.karate.model.DefesasEntity;

import java.util.ArrayList;
import java.util.List;

public class ActivityGolpes extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_golpes);
        recyclerView = findViewById(R.id.activityListGolpes);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ProgramAdapter programAdapter = new ProgramAdapter(this, listaDefesas());
        recyclerView.setAdapter(programAdapter);
    }

    public List<DefesasEntity> listaDefesas() {
        List<DefesasEntity> list = new ArrayList<>();
        list.add(new DefesasEntity("Gedan Barai", "Varrer \"embaixo\"", R.drawable.gedan_barai,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Jodan Age Uke", "Defesa Ascendente", R.drawable.jodan_age_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Jodan Juji Uke", "Defesa cruzada", R.drawable.juji_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Shuto Uke", "Defesa com a faca da mão", R.drawable.shuto_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Soto Uke", "Defesa circular", R.drawable.soto_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Uchi Uke", "Puxar o punhal", R.drawable.uchi_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Teisho Uke", "Defesa com a palma da mão", R.drawable.teisho_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));

        list.add(new DefesasEntity("Haishu Uke", "Defesa com as costas da mão", R.drawable.haishu_uke,
                "A própria defesa pode ser considerada um ataque dissuadindo o atacante. " +
                        "Paradas fundamentais: Gedan Barai - Bloqueio de cima para baixo. " +
                        "Geralmente para defender pontapés ou socos a altura do cinto, " +
                        "todavia funciona para algumas situações à altura do peito.", R.drawable.gedan_barau_execucao));
        return list;
    }
}
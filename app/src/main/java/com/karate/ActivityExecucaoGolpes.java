package com.karate;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.karate.model.DefesasEntity;

public class ActivityExecucaoGolpes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execucao_golpes);
        Bundle bundle = getIntent().getExtras();
        TextView txtDetails = findViewById(R.id.txt_details);
        ImageView imgTop = findViewById(R.id.img_defesa);
        ImageView imgExecution = findViewById(R.id.img_execucao);

        if (bundle != null) {
            DefesasEntity defesasEntity = (DefesasEntity) bundle.getSerializable("golpes");

            Toast.makeText(getApplicationContext(), defesasEntity.getNameHit(), Toast.LENGTH_SHORT).show();
            txtDetails.setText(defesasEntity.getTechnicasDetails());
            imgTop.setImageResource(defesasEntity.getImageCoup());
            imgExecution.setImageResource(defesasEntity.getExecutionCoup());

        }

    }
}
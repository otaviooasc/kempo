package com.karate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.karate.model.DefesasEntity;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    List<DefesasEntity> listDefesas;
    DefesasEntity golpes;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView rowName;
        TextView rowDescription;
        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rowName = itemView.findViewById(R.id.textTitle);
            rowDescription = itemView.findViewById(R.id.textDescription);
            rowImage = itemView.findViewById(R.id.imageGolpes);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public ProgramAdapter(Context context, List<DefesasEntity> listDefesas) {
        List<DefesasEntity> list = listDefesas;
        Collections.sort(list, Comparator.comparing(DefesasEntity::getNameHit));

        this.context = context;
        this.listDefesas = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.single_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        DefesasEntity defesasEntity = listDefesas.get(position);
        holder.rowName.setText(defesasEntity.getNameHit());
        holder.rowDescription.setText(defesasEntity.getDescriptionHit());
        holder.rowImage.setImageResource(defesasEntity.getImageCoup());

        holder.itemView.setOnClickListener(v -> {
            this.golpes = new DefesasEntity(defesasEntity.getNameHit(), defesasEntity.getDescriptionHit(), defesasEntity.getImageCoup(),
                    defesasEntity.getTechnicasDetails(), defesasEntity.getExecutionCoup());
            Intent intent = new Intent(v.getContext(), ActivityExecucaoGolpes.class);
            intent.putExtra("golpes", golpes);

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listDefesas.size();
    }
}

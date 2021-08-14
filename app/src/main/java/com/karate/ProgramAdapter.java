package com.karate;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.karate.model.GolpesEntity;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    String[] nameListGolpes;
    String[] descriptionListGolpes;
    int[] images;
    GolpesEntity golpes;

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

    public ProgramAdapter(Context context, String[] nameListGolpes, String[] descriptionListGolpes, int[] images) {
        this.context = context;
        this.nameListGolpes = nameListGolpes;
        this.descriptionListGolpes = descriptionListGolpes;
        this.images = images;
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
        holder.rowName.setText(nameListGolpes[position]);
        holder.rowDescription.setText(descriptionListGolpes[position]);
        holder.rowImage.setImageResource(images[position]);

        holder.itemView.setOnClickListener(v -> {
            this.golpes = new GolpesEntity(nameListGolpes[position], descriptionListGolpes[position], images[position]);
            Intent intent = new Intent(v.getContext(), ActivityExecucaoGolpes.class);

            context.startActivity(intent);

            Snackbar.make(v, nameListGolpes[position], Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();
        });
    }

    @Override
    public int getItemCount() {
        return nameListGolpes.length;
    }
}

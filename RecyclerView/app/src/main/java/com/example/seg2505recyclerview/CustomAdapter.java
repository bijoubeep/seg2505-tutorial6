package com.example.seg2505recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter
        extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    // Liste des données à afficher
    private final List<String> data;

    // Constructeur
    public CustomAdapter(List<String> data) {
        this.data = data;
    }

    // Créer un nouvel élément graphique
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_row_item, parent, false);

        return new ViewHolder(view);
    }

    // Associer les données à chaque élément
    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder, int position) {

        String item = data.get(position);

        holder.textView.setText(item);
    }

    // Retourner le nombre d'éléments
    @Override
    public int getItemCount() {
        return data.size();
    }

    // Classe interne ViewHolder
    public static class ViewHolder
            extends RecyclerView.ViewHolder {

        public final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
        }
    }
}

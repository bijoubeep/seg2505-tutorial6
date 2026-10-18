package com.example.seg2505recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Charger l'interface graphique XML
        setContentView(R.layout.activity_main);

        // Récupérer le RecyclerView depuis le XML
        RecyclerView recyclerView =
                findViewById(R.id.recyclerView);

        // Organiser les éléments verticalement
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );

        // Créer la liste de données
        List<String> items = new ArrayList<>();

        // Ajouter 40 éléments à la liste
        for (int i = 1; i <= 40; i++) {
            items.add("Élément " + i);
        }

        // Créer notre adaptateur personnalisé
        CustomAdapter adapter =
                new CustomAdapter(items);

        // Connecter l'adaptateur au RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
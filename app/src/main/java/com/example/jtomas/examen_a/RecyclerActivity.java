package com.example.jtomas.examen_a;

import static com.example.jtomas.examen_a.MainActivity.mapa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.jtomas.examen_a.databinding.ActivityRecyclerBinding;

//7 y 8.-RecyclerView
public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public Adaptador adaptador;
    ActivityRecyclerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adaptador = new Adaptador(mapa);
        recyclerView = binding.recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptador);
    }
}
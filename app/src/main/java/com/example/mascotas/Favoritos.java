package com.example.mascotas;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private RecyclerView list2Mascotas;
    ArrayList<Mascotas> mascotas2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);

        //TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        //toolbar_title.setText(R.string.textoMascotas);
        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        list2Mascotas = (RecyclerView) findViewById(R.id.rvFavoritos);

        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);

        list2Mascotas.setLayoutManager(llm2);

        init2Mascotas();
        inicializarAdaptador();
    }

    public void setSupportActionBar(Toolbar miActionBar) {
    }

    private void inicializarAdaptador(){
        Adaptador adaptador = new Adaptador(mascotas2,this);
        list2Mascotas.setAdapter(adaptador);
    }

    public void init2Mascotas(){
        mascotas2 = new ArrayList<Mascotas>();
        mascotas2.add(new Mascotas(1,"Cougo",R.drawable.perro1));
        mascotas2.add(new Mascotas(2,"Corujo",R.drawable.perro2));


    }

}


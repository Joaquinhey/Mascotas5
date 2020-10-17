package com.example.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listMascotas;
    ArrayList<Mascotas> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toolbar_title = (TextView) findViewById(R.id.actionBar);
        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        listMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listMascotas.setLayoutManager(llm);

        initMascotas();
        inicilizarAdaptador();
    }

    public void setSupportActionBar(Toolbar miActionBar) {
    }

    private void inicilizarAdaptador(){
        Adaptador adaptador = new Adaptador(mascotas,this);
        listMascotas.setAdapter(adaptador);
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas(1,"Cougo",R.drawable.perro1));
        mascotas.add(new Mascotas(2,"Corujo",R.drawable.perro2));
        mascotas.add(new Mascotas(3,"Bergessio",R.drawable.perro3));
        mascotas.add(new Mascotas(4,"Sebita",R.drawable.perro4));

    }

    public void irFavoritos(){
        Intent intent = new Intent(MainActivity.this, Favoritos.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAbout:
                Toast.makeText(MainActivity.this, "presiono about", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, ActivityAbout.class);
                startActivity(i);
                break;
            case R.id.mContacto:
                Toast.makeText(MainActivity.this, "presiono contacto", Toast.LENGTH_LONG).show();
                Intent ii = new Intent(MainActivity.this, ActivityContacto.class);
                startActivity(ii);

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
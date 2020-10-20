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

public class MainActivity extends AppCompatActivity implements IRecyclerViewFragmentView{

    private RecyclerView listMascotas;
    ArrayList<Mascota> mascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toolbar_title = (TextView) findViewById(R.id.actionBar);
        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        listMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
    }

    public void setSupportActionBar(Toolbar miActionBar) {
    }

/*
    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(1,"Cougo",R.drawable.perro1, likes));
        mascotas.add(new Mascota(2,"Corujo",R.drawable.perro2, likes));
        mascotas.add(new Mascota(3,"Bergessio",R.drawable.perro3, likes));
        mascotas.add(new Mascota(4,"Sebita",R.drawable.perro4, likes));

    }
*/
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

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listMascotas.setLayoutManager(llm);
    }

    @Override
    public Adaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        Adaptador adaptador = new Adaptador(mascotas,this);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(Adaptador adaptador) {
        listMascotas.setAdapter(adaptador);
    }
}
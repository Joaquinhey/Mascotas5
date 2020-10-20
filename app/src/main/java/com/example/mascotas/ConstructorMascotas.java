package com.example.mascotas;

import android.content.Context;

import java.util.ArrayList;

public class ConstructorMascotas {
    private Context contexto;

    public ConstructorMascotas(Context contexto){
        this.contexto = contexto;
    }

    public ArrayList<Mascota> obtenerDatos(){

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(1,"Cougo",R.drawable.perro1, 3));
        mascotas.add(new Mascota(2,"Corujo",R.drawable.perro2, 5));
        mascotas.add(new Mascota(3,"Bergessio",R.drawable.perro3, 7));
        mascotas.add(new Mascota(4,"Sebita",R.drawable.perro4, 4));
        return mascotas;
    }
}

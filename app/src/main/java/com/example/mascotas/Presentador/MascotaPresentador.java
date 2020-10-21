package com.example.mascotas.Presentador;

import android.content.Context;

import com.example.mascotas.DataBase.ConstructorMascotas;
import com.example.mascotas.Fragments.IRecyclerViewFragmentView;
import com.example.mascotas.POJO.Mascota;
import com.example.mascotas.DataBase.ConstructorMascotas;
import com.example.mascotas.Fragments.IRecyclerViewFragmentView;
import com.example.mascotas.POJO.Mascota;

import java.util.ArrayList;

public class MascotaPresentador implements IRecyclerViewPresentador {
    private IRecyclerViewFragmentView reciclerviewFragmentview;
    private Context context;
    private ConstructorMascotas constructorcontactos;
    private ArrayList<Mascota> contactos;

    public MascotaPresentador(IRecyclerViewFragmentView reciclerviewFragmentview, Context context) {
        this.reciclerviewFragmentview = reciclerviewFragmentview;
        this.context = context;
        obtenercontactosbasedatos();
    }

    @Override
    public void obtenercontactosbasedatos() {
        constructorcontactos = new ConstructorMascotas(context);
        contactos=constructorcontactos.obtenerfavoritos();
        mostrarcontactosRv();
    }

    @Override
    public void mostrarcontactosRv() {
        reciclerviewFragmentview.InicializarAdaptadorRV(reciclerviewFragmentview.crearadaptador(contactos));
        reciclerviewFragmentview.generarLinearLayout();
    }
}

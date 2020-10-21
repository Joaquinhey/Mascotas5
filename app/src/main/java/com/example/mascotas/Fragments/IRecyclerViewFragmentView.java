package com.example.mascotas.Fragments;

import java.util.ArrayList;

import com.example.mascotas.Adaptadores.MascotaAdapter;
import com.example.mascotas.POJO.Mascota;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayout();

    public MascotaAdapter crearadaptador(ArrayList<Mascota> contactos);

    public void InicializarAdaptadorRV(MascotaAdapter adaptador);
    }



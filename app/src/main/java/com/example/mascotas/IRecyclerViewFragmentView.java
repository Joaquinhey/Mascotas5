package com.example.mascotas;

import java.util.ArrayList;
import com.example.mascotas.Adaptador;
import com.example.mascotas.Mascota;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public Adaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(Adaptador adaptador);


}

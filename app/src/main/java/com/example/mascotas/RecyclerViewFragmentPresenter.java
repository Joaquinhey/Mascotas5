package com.example.mascotas;

import android.content.Context;

import com.example.mascotas.DataBase.ConstructorMascotas;
import com.example.mascotas.Fragments.IRecyclerViewFragmentView;
import com.example.mascotas.POJO.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter (IRecyclerViewFragmentView iRecyclerViewFragmentView, Context contexto){
       this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
       this.context = context;
       obtenerMascotas();
    }

    @Override
    public void obtenerMascotas() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerdatos();
        mostrarMascotas();
    }

    @Override
    public void mostrarMascotas() {
        iRecyclerViewFragmentView.InicializarAdaptadorRV(iRecyclerViewFragmentView.crearadaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayout();
    }
}

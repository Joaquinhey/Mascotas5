package com.example.mascotas.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mascotas.Adaptadores.MascotaAdapter;
import com.example.mascotas.POJO.Mascota;
import com.example.mascotas.Presentador.IRecyclerViewPresentador;
import com.example.mascotas.Presentador.MascotaPresentador;
import com.example.mascotas.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaFavoritaFragment extends Fragment implements IRecyclerViewFragmentView {
    private RecyclerView ListaMascotas;
    ArrayList<Mascota> contactos;
    private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mascota_favorita,container,false);
        ListaMascotas = v.findViewById(R.id.ListaMascotas);
        presenter = new MascotaPresentador(this,getContext());
        return v;

    }

    @Override
    public void generarLinearLayout() {
        GridLayoutManager glm = new GridLayoutManager(getActivity() ,2 );
        ListaMascotas.setLayoutManager(glm);
    }


    @Override
    public MascotaAdapter crearadaptador(ArrayList<Mascota> contactos) {
        MascotaAdapter adaptador  = new MascotaAdapter(contactos,getActivity());
        return adaptador;
    }
    @Override
    public void InicializarAdaptadorRV(MascotaAdapter adaptador) {
        ListaMascotas.setAdapter(adaptador);
    }




}
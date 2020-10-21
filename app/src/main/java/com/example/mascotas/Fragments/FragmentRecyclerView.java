package com.example.mascotas.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mascotas.POJO.Mascota;
import com.example.mascotas.Adaptadores.MascotaAdapter;
import com.example.mascotas.R;
import com.example.mascotas.Presentador.IRecyclerViewPresentador;
import com.example.mascotas.Presentador.RecyclerViewPresentador;

import java.util.ArrayList;


public class FragmentRecyclerView extends Fragment implements IRecyclerViewFragmentView {
    private RecyclerView ListaMascotas;
    ArrayList<Mascota> contactos;
    private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_reciclerview,container,false);

        ListaMascotas = v.findViewById(R.id.ListaMascotas);
        presenter= new RecyclerViewPresentador(this,getContext());
        return v;

    }


    public void generarLinearLayout() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);
        //   GridLayoutManager glm = new GridLayoutManager(this ,2 );
    }

    public MascotaAdapter crearadaptador(ArrayList<Mascota> contactos) {
        MascotaAdapter adaptador  = new MascotaAdapter(contactos,getActivity());
        return adaptador;
    }

    public void InicializarAdaptadorRV(MascotaAdapter adaptador) {
        ListaMascotas.setAdapter(adaptador);
    }
}


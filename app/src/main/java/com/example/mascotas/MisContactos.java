package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.example.mascotas.Adaptadores.MascotaAdapter;
import com.example.mascotas.Adaptadores.PageAdapter;
import com.example.mascotas.Fragments.MascotaFavoritaFragment;
import com.example.mascotas.POJO.Mascota;

import java.util.ArrayList;

public class MisContactos extends AppCompatActivity {

    ArrayList<Mascota> contactos;
    private Toolbar toolbar1;
    private TabLayout tabLayout1;
    private ViewPager viewPager1;

    //String like1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_contactos);
        Toolbar tootb = findViewById(R.id.actionbar);
        toolbar1     = findViewById(R.id.toolbarfr1);
        tabLayout1   = findViewById(R.id.tablayout1);
        viewPager1   =findViewById(R.id.viewpager1);
        setSupportActionBar(tootb);
        setupviewpager();

        if (toolbar1 != null){
            setSupportActionBar(toolbar1);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return (true);
    }
    @Override
    public boolean onKeyDown (int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent= new Intent(MisContactos.this,MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }

    private ArrayList<Fragment> agregarfragments (){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new MascotaFavoritaFragment());
        return fragments;
    }
    public void setupviewpager(){
        viewPager1.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarfragments()));
        tabLayout1.setupWithViewPager(viewPager1);
        tabLayout1.getTabAt(0).setIcon(R.drawable.estrella);
    }

}

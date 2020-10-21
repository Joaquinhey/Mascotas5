package com.example.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mascotas.Adaptadores.PageAdapter;
import com.example.mascotas.Fragments.FragmentRecyclerView;
import com.example.mascotas.Fragments.IRecyclerViewFragmentView;
import com.example.mascotas.Menus.ActivityAbout;
import com.example.mascotas.Menus.ActivityMascota;
import com.example.mascotas.POJO.Mascota;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    //  private ImageButton favoritoimagen;
    //   private TextView like1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tootb.setLogo(R.drawable.pataperro);
        toolbar     = findViewById(R.id.toolbarfr);
        tabLayout   = findViewById(R.id.tablayout);
        viewPager   =findViewById(R.id.viewpager);
        Toolbar tootb = findViewById(R.id.actionbar);
        setSupportActionBar(tootb);
        setupviewpager();

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }
    }
    private ArrayList<Fragment> agregarfragments (){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new FragmentRecyclerView());
        return fragments;
    }
    public void setupviewpager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarfragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.estrella);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return (true);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Favoritos:
                Intent intent1 = new Intent(MainActivity.this, MisContactos.class);
                startActivity(intent1);
                break;
            case R.id.About:
                Intent intent = new Intent(this, ActivityAbout.class);
                startActivity(intent);
                break;
            case R.id.Contacto:
                Intent intent2 = new Intent(this, ActivityMascota.class);
                startActivity(intent2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
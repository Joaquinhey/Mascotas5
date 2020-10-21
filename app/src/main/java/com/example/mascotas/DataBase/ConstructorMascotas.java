package com.example.mascotas.DataBase;

import android.content.ContentValues;
import android.content.Context;

import com.example.mascotas.R;
import com.example.mascotas.POJO.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    public ConstructorMascotas(Context context) {
        this.context = context;
    }
    public ArrayList<Mascota> obtenerdatos (){
        BaseDatos db = new BaseDatos(context);
        insertarcontactos(db);
        return db.obtenertodocontactos();
    }

    public void insertarcontactos(BaseDatos db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_NOMBRE , "Patas");
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_FOTO , R.drawable.perro1);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_NOMBRE , "Tomy");;
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_FOTO , R.drawable.perro2);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_NOMBRE , "Seis");
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_FOTO , R.drawable.perro3);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_NOMBRE , "Sasha");
        contentValues.put(ConstantesBD.TABLE_MASCOTAS_FOTO , R.drawable.perro4);
        db.insertarcontacto(contentValues);


    }

    public ArrayList<Mascota> obtenerfavoritos (){
        ArrayList<Mascota> mascotas = new ArrayList<>();
        BaseDatos db = new BaseDatos(context);
        db.obtenertodocontactos();
        return db.obtenertodofavoritos();

    }
    public void darlike (Mascota contacto){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBD.TABLE_LIKES_MASCOTAS_ID_CONTACTO, contacto.getId());
        contentValues.put(ConstantesBD.TABLE_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
        db.insertarcontactolike(contentValues);
    }
    public int obtenerlikescontacto(Mascota contacto){
        BaseDatos db = new BaseDatos(context);
        return  db.obtenerlikescontacto(contacto);
    }
}

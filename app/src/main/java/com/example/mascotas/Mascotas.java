package com.example.mascotas;

public class Mascotas {
    private int idMascota;
    private String nombreMascota;
    private int fotoMascota;

    public Mascotas(int idMascota, String nombreMascota, int fotoMascota) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.fotoMascota = fotoMascota;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

}
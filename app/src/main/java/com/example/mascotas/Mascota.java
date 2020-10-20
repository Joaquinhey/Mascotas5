package com.example.mascotas;

public class Mascota {
    private int idMascota;
    private String nombreMascota;
    private int fotoMascota;
    private int id;
    private int likes;

    public Mascota(int idMascota, String nombreMascota, int fotoMascota, int likes) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.fotoMascota = fotoMascota;
        this.likes = likes;
    }

    public int getLikes() {        return likes;    }

    public void setLikes(int likes) {        this.likes = likes;    }

    public int getId() {return id;    }

    public void setId(int id) {        this.id = id;    }
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
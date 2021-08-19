package com.example.recyclerviewjava;

public class Muro {

    private int foto;
    private String post;
    private int fotoUser;
    private String nameUser;

    public Muro(int foto, String post, int fotoUser, String nameUser) {
        this.foto = foto;
        this.post = post;
        this.fotoUser = fotoUser;
        this.nameUser = nameUser;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getFotoUser() {
        return fotoUser;
    }

    public void setFotoUser(int fotoUser) {
        this.fotoUser = fotoUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Override
    public String toString() {
        return "Muro{" +
                "foto=" + foto +
                ", post='" + post + '\'' +
                ", fotoUser='" + fotoUser + '\'' +
                ", nameUser='" + nameUser + '\'' +
                '}';
    }
}

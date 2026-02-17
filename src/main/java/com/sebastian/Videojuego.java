package com.sebastian;

public class Videojuego {
    private int id;
    private String titulo;
    private double precio;
    private int idCategoria;

    public Videojuego() {} 

    public Videojuego(int id, String titulo, double precio, int idCategoria) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.idCategoria = idCategoria;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }
}

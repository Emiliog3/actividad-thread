package com.iudigital.concurrency.activity.domain;

public class Producto {

    // Atributos

    private String nombre;
    private float precio;
    private int cantidad;


    // Constructor vacío

    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.cantidad = 0;
    }

    // Constructor con todos los campos


    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }


    // Getters y Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}

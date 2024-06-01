package com.iudigital.concurrency.activity.domain;

import java.util.List;

// Esta clase se llama dominio porque es la representación de un objeto de negocio.
// Es decir, un objeto que se utiliza para representar un concepto de negocio.

public class ClienteProducto {

    private final String nombre;
    private final List<Producto> productos;

    // Constructor con todos los campos
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    // Se agregan solamente los getters porque no se requiere modificar los
    // atributos
    public String getNombre() {
        return this.nombre;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }
}

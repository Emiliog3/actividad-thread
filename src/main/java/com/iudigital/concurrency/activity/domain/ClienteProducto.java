package com.iudigital.concurrency.activity.domain;

import java.util.List;

public class ProductoCliente {

    private final String nombre;

    private final List<Producto> productos;

    // Constructor con todos los campos


    public ProductoCliente(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }


    // Se agrega solamente los getters porque no se requiere modificar los atributos


    public List<Producto> getProductos() {
        return productos;
    }
}


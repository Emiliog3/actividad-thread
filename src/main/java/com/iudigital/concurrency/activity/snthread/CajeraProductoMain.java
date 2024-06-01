package com.iudigital.concurrency.activity.snthread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraProductoMain {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>(); // Lista de productos

        // Llenar la lista de productos
        setProductos(productos);

        // Crear clientes con productos y nombres
        ClienteProducto cliente1 = new ClienteProducto("Juan", productos);
        ClienteProducto cliente2 = new ClienteProducto("María", productos);
        ClienteProducto cliente3 = new ClienteProducto("Carlos", productos);

        long initialTime = System.currentTimeMillis(); // Tiempo inicial

        // Crear cajeras con nombres
        CajeraProducto cajera1 = new CajeraProducto("Cajera Ana");
        CajeraProducto cajera2 = new CajeraProducto("Cajera Luisa");
        CajeraProducto cajera3 = new CajeraProducto("Cajera Pedro");

        // Procesar compras
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        cajera3.procesarCompra(cliente3, initialTime);
    }

    // Método para llenar la lista de productos
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Leche", 100, 2);
        Producto producto2 = new Producto("Pan", 50, 3);
        Producto producto3 = new Producto("Huevos", 30, 12);

        // Agregar productos a la lista
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}

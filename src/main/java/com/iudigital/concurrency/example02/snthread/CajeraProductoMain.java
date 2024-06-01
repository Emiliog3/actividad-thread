package com.iudigital.concurrency.example02.snthread;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class CajeraProductoMain {

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Cliente 1", productos);
        ClienteProducto cliente2 = new ClienteProducto("Cliente 2", productos);
        ClienteProducto cliente3 = new ClienteProducto("Cliente 3", productos);

        long initialTime = System.currentTimeMillis();

        CajeraProducto cajera1 = new CajeraProducto("Cajera 1");
        CajeraProducto cajera2 = new CajeraProducto("Cajera 2");
        CajeraProducto cajera3 = new CajeraProducto("Cajera 3");

        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        cajera3.procesarCompra(cliente3, initialTime);

    }


    private static void setProductos(List<Producto> productos) {

        Producto producto1 = new Producto("Producto 1", 100, 2);
        Producto producto2 = new Producto("Producto 2", 200, 1);
        Producto producto3 = new Producto("Producto 3", 300, 3);


        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);



        };
    
}

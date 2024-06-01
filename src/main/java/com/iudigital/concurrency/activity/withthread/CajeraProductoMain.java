package com.iudigital.concurrency.activity.withthread;

import java.util.ArrayList;
import java.util.List;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

// Clase principal que ejecuta el programa

public class CajeraProductoMain {

    // Método principal

    public static void main(String[] args) {

        // Crear productos y agregarlos a una lista

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Leche", 150, 2));
        productos.add(new Producto("Pan", 50, 3));
        productos.add(new Producto("Huevos", 30, 12));

        // Crear clientes con productos y asignarles la lista de productos

        ClienteProducto cliente1 = new ClienteProducto("Juan Pérez", productos);
        ClienteProducto cliente2 = new ClienteProducto("María González", productos);
        ClienteProducto cliente3 = new ClienteProducto("Carlos López", productos);

        // Tiempo inicial

        long tiempoInicial = System.currentTimeMillis();

        // Crear y ejecutar hilos (cajeras)

        Thread cajera1 = new Thread(new CajeraProducto("Cajera 1", cliente1, tiempoInicial));
        Thread cajera2 = new Thread(new CajeraProducto("Cajera 2", cliente2, tiempoInicial));
        Thread cajera3 = new Thread(new CajeraProducto("Cajera 3", cliente3, tiempoInicial));

        // Iniciar hilos

        cajera1.start();
        cajera2.start();
        cajera3.start();
    }
}

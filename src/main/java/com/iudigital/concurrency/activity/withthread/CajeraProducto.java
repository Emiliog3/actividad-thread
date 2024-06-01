package com.iudigital.concurrency.activity.withthread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

// Clase que simula una cajera de un supermercado

public class CajeraProducto implements Runnable {

    // Atributos de la clase

    private String nombreCajera;
    private ClienteProducto cliente;
    private long timeStamp;

    // Constructor vacío

    public CajeraProducto() {
        this.nombreCajera = "";
        this.cliente = null;
        this.timeStamp = 0;
    }

    // Constructor con todos los campos

    public CajeraProducto(String nombreCajera, ClienteProducto cliente, long timeStamp) {
        this.nombreCajera = nombreCajera;
        this.cliente = cliente;
        this.timeStamp = timeStamp;
    }

    // Método run que se ejecuta al correr el hilo

    @Override
    public void run() {
        System.out.println("La cajera " + this.nombreCajera + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

        int contadorProductos = 1; // Contador de productos inicia en 1

        // Se recorren los productos del cliente

        for (Producto producto : cliente.getProductos()) {
            esperarXsegundos();
            System.out.println("Procesando el producto " + contadorProductos
                    + " -> Nombre: " + producto.getNombre()
                    + ", Precio: $" + producto.getPrecio()
                    + ", Cantidad: " + producto.getCantidad()
                    + ", Costo total: $" + producto.getPrecio() * producto.getCantidad()
                    + ", Tiempo de procesamiento: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
            contadorProductos++;
        }

        System.out.println("La cajera " + this.nombreCajera + " HA TERMINADO DE PROCESAR A " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    }

    // Método que simula la espera de un segundo

    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

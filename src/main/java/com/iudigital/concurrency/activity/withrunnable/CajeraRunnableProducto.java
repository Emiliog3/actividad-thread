package com.iudigital.concurrency.activity.withrunnable;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class CajeraRunnableProducto implements Runnable {

    private String nombreCajera;
    private ClienteProducto cliente;
    private long timeStamp;

    public CajeraRunnableProducto(String nombreCajera, ClienteProducto cliente, long timeStamp) {
        this.nombreCajera = nombreCajera;
        this.cliente = cliente;
        this.timeStamp = timeStamp;
    }

    @Override
    public void run() {
        procesarCompra(cliente, timeStamp);
    }

    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombreCajera + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

        int contadorProductos = 1;

        for (Producto producto : cliente.getProductos()) {
            esperarXsegundos();
            
            // Salto de línea

            System.out.println();
            System.out.println("Procesando el producto " + contadorProductos
                    + " -> Nombre: " + producto.getNombre()
                    + ", Precio: $" + producto.getPrecio()
                    + ", Cantidad: " + producto.getCantidad()
                    + ", Costo total: $" + producto.getPrecio() * producto.getCantidad()
                    + ", Cliente: " + cliente.getNombre()
                    + ", Tiempo de procesamiento: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

            System.out.println(
                    "======================================================================================================================================");

            contadorProductos++;
        }

        System.out.println("La cajera " + this.nombreCajera + " HA TERMINADO DE PROCESAR A " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

        // Salto de línea
                
        System.out.println();
    }

    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

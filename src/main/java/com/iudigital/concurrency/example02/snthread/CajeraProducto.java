package com.iudigital.concurrency.example02.snthread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class CajeraProducto {

    // Attributes

    private String nombreCajera;

    // Constructor

    public CajeraProducto(String nombreCajera) {
        this.nombreCajera = nombreCajera;
    }

    // Methods

    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombreCajera + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

        int contCliente = 1;

        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos();
            System.out.println("Procesando el pedido del cliente " + contCliente
                    + " nombre producto: " + producto.getNombre()
                    + " -> Precio producto: " + producto.getPrecio()
                    + " -> Cantidad productos: " + producto.getCantidad()
                    + " -> Costo total del producto: " + producto.getPrecio() * producto.getCantidad()
                    + " -> Tiempo de procesamiento: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

                    System.out.println("======================================================================================================================================");

        }

        System.out.println("La cajera " + this.nombreCajera + " HA TERMINADO DE PROCESAR " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

    }

    private void esperarXsegundos() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
package com.iudigital.concurrency.example;

// Clase principal que contiene el método main

public class MainRunnableClass {

    public static void main(String[] args) {

        // Creación y ejecución de un hilo mediante la implementación de Runnable
        RunnableClass rc = new RunnableClass();
        
        Thread hilo = new Thread(rc); // Crear un nuevo hilo y pasarle la instancia de Runnable
        hilo.start(); // Iniciar el hilo

        // Mensajes del hilo principal
        System.out.println("Hello, I am the main thread");
        System.out.println("Finishing");
        System.out.println("==================================");
    }
}

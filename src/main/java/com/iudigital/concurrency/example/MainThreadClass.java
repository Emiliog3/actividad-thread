package com.iudigital.concurrency.example;

// Clase principal que contiene el método main
public class MainThreadClass {

    public static void main(String[] args) {
        // Creación y ejecución de un hilo mediante una subclase de Thread
        ThreadClass tc = new ThreadClass();
        tc.start(); // Iniciar el hilo

        // Mensajes del hilo principal
        System.out.println("ThreadClass Main, started and processing");
        System.out.println("Finishing MainThreadClass");
        System.out.println("==================================");
    }
}

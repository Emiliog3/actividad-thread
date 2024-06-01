package com.iudigital.concurrency.example;

public class AnonymousClass {

    public static void main(String[] args) {

        // Creación y Ejecución de un Hilo usando una Clase Anónima
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                // Bucle que imprime un mensaje 10 veces
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello, I am an AnonymousClass: " + i);
                }
            }
        });
        // Iniciar el hilo
        hilo.start();

        // Mensajes del hilo principal
        System.out.println("Hello, I am the main thread and success");
        System.out.println("Finishing");
        System.out.println("==================================");
    }
}

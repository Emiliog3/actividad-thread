package com.iudigital.concurrency.example;

public class RunnableClass implements Runnable {
    
    // Método run que se ejecutará en un hilo
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, I am a RunnableClass: " + i);
        }

    }
}

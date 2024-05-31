package com.iudigital.concurrency.example;

public class PrincipalRunnable {

    public static void main(String[] args) {
        RunnableClass rc = new RunnableClass();
        Thread hilo = new Thread(rc);
        hilo.start();

        System.out.println("Hello, I am the main thread");
        System.out.println("Finishing");
        System.out.println("==================================");

    }
}

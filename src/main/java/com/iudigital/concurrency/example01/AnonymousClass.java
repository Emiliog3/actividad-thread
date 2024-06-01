package com.iudigital.concurrency.example01;

public class AnonymousClass {

public static void main(String[] args) {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello, I am a AnonymousClass: " + i);
                }
            }
        });
        hilo.start();

    System.out.println("Hello, I am the main thread and success");
    System.out.println("Finishing");
    System.out.println("==================================");


    }


}

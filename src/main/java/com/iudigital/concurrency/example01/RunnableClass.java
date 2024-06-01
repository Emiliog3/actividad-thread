package com.iudigital.concurrency.example01;

public class RunnableClass implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, I am a RunnableClass: " + i);
        }

    }
}

package com.iudigital.concurrency.example01;

public class ThreadClass extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, I am a ThreadClass: " + i);
        }
    }
}
package com.iudigital.concurrency.example;

public class MainThreadClass {
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        tc.start();

        System.out.println("ThreadClass Main, started and proceesing");
        System.out.println("Finishing MainThreadClass");
        System.out.println("==================================");


        }

}


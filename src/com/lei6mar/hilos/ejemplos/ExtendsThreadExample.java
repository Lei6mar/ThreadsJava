package com.lei6mar.hilos.ejemplos;

import com.lei6mar.hilos.ejemplos.thread.NombreThread;

public class ExtendsThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new NombreThread("John Doe");
        thread.start();
//        Thread.sleep(2);
        Thread hilo2 = new NombreThread("Humberto");
        hilo2.start();

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(thread.getState());
    }
}

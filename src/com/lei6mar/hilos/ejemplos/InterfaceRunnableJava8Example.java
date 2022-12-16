package com.lei6mar.hilos.ejemplos;

import com.lei6mar.hilos.ejemplos.runnable.ViajeTarea;

public class InterfaceRunnableJava8Example {
    public static void main(String[] args) {
        Runnable viaje = () ->{
                for(int i = 0; i<10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a: "+ Thread.currentThread().getName());
        };


        new Thread(viaje, "Isla de Pascua").start();
        new Thread(viaje,"Washington").start();
        new Thread(viaje,"Chipre").start();
    }
}

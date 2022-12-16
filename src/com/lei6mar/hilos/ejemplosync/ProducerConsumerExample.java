package com.lei6mar.hilos.ejemplosync;

import com.lei6mar.hilos.ejemplosync.runnable.Consumidor;
import com.lei6mar.hilos.ejemplosync.runnable.Panadero;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }
}

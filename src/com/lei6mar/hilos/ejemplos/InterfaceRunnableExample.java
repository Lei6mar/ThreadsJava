package com.lei6mar.hilos.ejemplos;

import com.lei6mar.hilos.ejemplos.runnable.ViajeTarea;

public class InterfaceRunnableExample {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Washington")).start();
        new Thread(new ViajeTarea("Chipre")).start();

    }
}

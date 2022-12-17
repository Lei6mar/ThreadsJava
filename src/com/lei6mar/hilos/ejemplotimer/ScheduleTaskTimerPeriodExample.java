package com.lei6mar.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduleTaskTimerPeriodExample {
    public static void main(String[] args) {
        Timer timer  =  new Timer();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if(i > 0){
                    toolkit.beep();
                    System.out.println("Tarea "+i+" periodica en: "+new Date() + " nombre del Thread: " +
                            Thread.currentThread().getName());
                }else{
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        }, 0, 10000);

        System.out.println("Agendamos tarea inmediatamente que se repite cada 10 segundos... ");
    }
}

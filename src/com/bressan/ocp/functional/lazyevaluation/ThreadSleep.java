package com.bressan.ocp.functional.lazyevaluation;

import java.util.Random;

public class ThreadSleep extends Thread {

    public void run() {
       // Random r = new Random();
        try {
            //int x = r.nextInt(2000 - 10) + 10;
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void startThread() {
        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.run();
    }
}

package com.angeltm.threadsAndRunnable;

public class Threads {
    public static void ex() {
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("first thread");
        thread1.start();
        ThreadExample thread2 = new ThreadExample();
        thread2.setName("seccond thread");
        thread2.start();
    }
}

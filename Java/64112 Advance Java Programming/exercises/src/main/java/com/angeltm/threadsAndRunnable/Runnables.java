package com.angeltm.threadsAndRunnable;

public class Runnables {
    public static void ex() {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();
        Thread thread2 = new Thread(new RunnableExample());
        thread2.start();
        
    }
}

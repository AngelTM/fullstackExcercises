package com.angeltm.threadsAndRunnable;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("i "+this.getName());
        }
    }
}

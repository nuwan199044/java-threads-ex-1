package org.example;

public class Shopper extends Thread {

    static int garlicCount = 0;

    public void run() {
        for(int i=0; i < 10_000_000; i++) {
            garlicCount++;
        }
    }

}

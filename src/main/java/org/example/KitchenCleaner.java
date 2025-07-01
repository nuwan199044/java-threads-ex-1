package org.example;

public class KitchenCleaner extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Olivia is cleaning the kitchen");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package org.example;

public class ChefOlivia implements Runnable {
    @Override
    public void run() {
        System.out.println("Olivia started and waiting for sausage to thaw...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Olivia is done cutting sausage.");
    }
}

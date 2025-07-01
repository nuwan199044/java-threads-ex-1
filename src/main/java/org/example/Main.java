package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();

        barron.start();
        olivia.start();

        barron.join();
        olivia.join();

        System.out.println("We should buy "+ Shopper.garlicCount +" garlic.");
    }
}
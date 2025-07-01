package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Barron started & requesting Olivia's help.");
        Thread olivia = new Thread(new ChefOlivia());
        System.out.println("Olivia state "+olivia.getState());

        System.out.println("Barron tells Olivia to start.");
        olivia.start();
        System.out.println("Olivia state "+olivia.getState());

        System.out.println("Barron continues cooking soup.");
        Thread.sleep(500);
        System.out.println("Olivia state "+olivia.getState());

        System.out.println("Barron patiently wait for Olivia to finish and join...");
        olivia.join();
        System.out.println("Olivia state "+olivia.getState());

        System.out.println("Barron and Olivia are both done!");

    }
}
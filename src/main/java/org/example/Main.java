package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper barron = new VegetableChopper("barron");
        VegetableChopper olivia = new VegetableChopper("olivia");

        barron.start(); // barron start chopping
        olivia.start(); // olivia start chopping
        Thread.sleep(1000); //continue chopping for one second
        VegetableChopper.chopping = false; //stop chopping

        barron.join();
        olivia.join();
        System.out.format("Barron chopped %d vegetables \n", barron.vegetableCount);
        System.out.format("Olivia chopped %d vegetables \n", olivia.vegetableCount);

    }
}
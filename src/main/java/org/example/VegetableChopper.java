package org.example;

public class VegetableChopper extends Thread {
    public int vegetableCount = 0;
    public static boolean chopping = true;

    public VegetableChopper(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (chopping) {
            System.out.println(this.getName()+ "chopped vegetable!");
            vegetableCount++;
        }
    }
}

package app;

import app.threads.FruitThread;
import app.threads.VegetableThread;

public class Main {
    public static void main(String[] args) {
        FruitThread fruitThread = new FruitThread();
        VegetableThread vegetableThread = new VegetableThread();
        fruitThread.start();
        vegetableThread.start();
    }
}
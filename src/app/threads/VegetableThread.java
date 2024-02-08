package app.threads;

public class VegetableThread extends Thread {
    @Override
    public void run() {
        String[] vegetables = {"tomato", "cabbage", "carrot", "potato", "onion"};
        for (String vegetable : vegetables) {
            try {
                Thread.sleep(100);
                System.out.println("Vegetables: " + vegetable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
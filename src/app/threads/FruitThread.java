package app.threads;

public class FruitThread extends Thread {
    @Override
    public void run() {
        String[] fruits = {"apple", "banana", "grapes", "kiwi", "mango"};
        for (String fruit : fruits) {
            try {
                Thread.sleep(1000);
                System.out.println("Fruits: " + fruit);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100); // Generate a random number between 0 and 99
            System.out.println("Generated number: " + num);

            if (num % 2 == 0) {
                System.out.println("Square of " + num + " is: " + (num * num));
            } else {
                System.out.println("Cube of " + num + " is: " + (num * num * num));
            }

            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SimpleMultiThreadApp {
    public static void main(String[] args) {
        new NumberGenerator().start(); // Start the number generator thread
    }
}

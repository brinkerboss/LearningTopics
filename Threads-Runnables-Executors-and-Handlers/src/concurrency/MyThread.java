package concurrency;

import java.util.Date;

public class MyThread extends Thread {

    @Override
    public void run() {
        int iterations = 5;

        try {
            for (int i = 0; i < iterations; i++) {
                Date date = new Date();
                System.out.println("From Secondary thread " + date);

                sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println(e);

        }

    }
}



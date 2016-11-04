/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import static java.lang.Thread.sleep;
import java.util.Date;

/**
 *
 * @author jbrinkerhoff
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        int iterations = 5;

        try {
            for (int i = 0; i < iterations; i++) {
                Date date = new Date();
                System.out.println("From runnable "+ date);

                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.err.println(e);

        }
    }
    
}

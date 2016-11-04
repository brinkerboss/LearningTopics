package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Concurrency {

    
    public static void main(String[] args) {
        
        int iterations = 3;
        
        MyThread thread = new MyThread();
        
        MyRunnable runnable = new MyRunnable();
        
        new Thread(runnable).start();
        
        ExecutorService executor = Executors.newCachedThreadPool();
        
        
        executor.execute(runnable);
        
        try {
        for (int i = 0; i < iterations; i++) {
            
            Date date = new Date();
            
            
                System.out.println("From main process " + date);
                Thread.sleep(3000);
            } } catch (InterruptedException e) {
                System.err.println(e);
            }
        
        
    }
    
}

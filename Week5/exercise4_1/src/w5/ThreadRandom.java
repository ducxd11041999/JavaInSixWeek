package w5;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRandom extends Thread{
    SharedData sharedData;

    public ThreadRandom(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Random random = new Random();
        
       while(true) {
//            System.out.println("T1 >> " + i);
            synchronized(sharedData) {
                int rad = random.nextInt(100) + 1;
                sharedData.setRad(rad);
                System.out.println("Thread 1 Random : " + rad);
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
  
    }
}

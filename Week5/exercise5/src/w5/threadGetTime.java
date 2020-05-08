package w5;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.logging.Level;
import java.util.logging.Logger;


public class threadGetTime extends Thread{
    SharedData sharedData;

    public threadGetTime(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(threadGetTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
       while(true) {
//            System.out.println("T1 >> " + i);
            synchronized(sharedData) {
            	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();
                float timeHandle = (float)(now.getHour()*60 + now.getMinute() + now.getSecond()/60.0);
                int second = now.getSecond();
                sharedData.setData(second);
                System.out.println("Thread 1 Calculator time follow Minute : "+ dtf.format(now)+" = " + timeHandle + " Minute");
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(threadGetTime.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
  
    }
}
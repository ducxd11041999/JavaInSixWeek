package w5;
import java.util.logging.Level;
import java.util.logging.Logger;

public class threadPrintSecond extends Thread{
    SharedData sharedData;

    public threadPrintSecond(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    public static boolean isOddNumber(int x)
    {
    	if(x % 2 != 0)
    		return true;
    	return false;
    }
    @Override
    public void run() {
       while(true) {
//            System.out.println("T2 >> " + i);
            synchronized(sharedData) {
                try {
                    sharedData.notifyAll();
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(threadPrintSecond.class.getName()).log(Level.SEVERE, null, ex);
                }
                int second = sharedData.getData();
                if(threadPrintSecond.isOddNumber(second))
                {
                	System.out.println("Thread 2 said "+second + " is odd number(so le)");
                }
                else
                {
                	System.out.println("Thread 2 said "+ second + " is  even number(so chan)");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(threadPrintSecond.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    
}
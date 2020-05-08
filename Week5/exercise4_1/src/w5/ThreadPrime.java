package w5;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPrime extends Thread{
    SharedData sharedData;

    public ThreadPrime(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    public static boolean isPrime(int x)
    {
    	if(x < 2 )
    		return false;
    	else
    	{
    		for(int i=2; i <= Math.sqrt(x); i++)
    		{
    			if(x % i == 0)
    				return  false;
    		}
    	}
    	return true;
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
                    Logger.getLogger(ThreadPrime.class.getName()).log(Level.SEVERE, null, ex);
                }
                int rad = sharedData.getRad();
                if(ThreadPrime.isPrime(rad))
                {
                	System.out.println("Thread 2 said "+rad + " is Prime");
                }
                else
                {
                	System.out.println("Thread 2 said "+ rad + " is not Prime");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    
}
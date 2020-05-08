package w5;

import java.util.Random;

public class FiveThreads extends Thread {
	int tmp;
    public FiveThreads(String name) {
        super(name);
    }
    public int getValue()
    {
    	return tmp;
    }
    @Override
    public void run() {
        //System.out.println(getName());
            try {
            	Random rd = new Random();
            	tmp = rd.nextInt(10);
            	System.out.println(tmp);
            	Thread.sleep(10);
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        System.out.println();
    }
 
    public static void main(String[] args) throws InterruptedException {
    	FiveThreads[] threads = new FiveThreads[5];
    	int Sum=0;
    	for(int i=0 ;i < 5; i++)
    	{
    		threads[i] = new FiveThreads("Thread " + String.valueOf(i));
    		threads[i].start();
    		threads[i].join();
    	}
    	for(int i=0 ;i < 5; i++)
    	{
    		Sum += threads[i].getValue();
    	}
    	 System.out.println("Sum of random "+ Sum);    
    }
}

package w5;

import java.util.Random;

public class TenThreads {
    private static class WorkerThread extends Thread {
    int max = Integer.MIN_VALUE;
    int[] ourArray;
    public WorkerThread(int[] ourArray) {
        this.ourArray = ourArray;
    }
    // Find the maximum value in our particular piece of the array
        @Override
        public void run() {
        	for (int i = 0; i < ourArray.length; i++)
        		max = Math.max(max, ourArray[i]);
   	}
    public int getMax() {
        return max;
    	}
    }
    public static int[][] getBigHairyMatrix(){
        Random generator = new Random();
        int[][] Matrix=new int[10][10];
        for(int i=0;i<10;i++){  
            for(int j=0;j<10;j++){ 
                Matrix[i][j]=generator.nextInt(100);
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        return Matrix;
    }

    public static void main(String[] args) {

    WorkerThread[] threads = new WorkerThread[10];
    int[][] bigMatrix = getBigHairyMatrix();
    int max = Integer.MIN_VALUE;
    // Give each thread a slice of the matrix to work with
    for (int i=0; i < 10; i++) {
        threads[i] = new WorkerThread(bigMatrix[i]);
        threads[i].start();
    }
    // Wait for each thread to finish
    try {
        for (int i=0; i < 10; i++) {
        threads[i].join();
        max = Math.max(max, threads[i].getMax());
        }
    }
    catch (InterruptedException e) {
    	 System.out.println("Fail");
    	}
    System.out.println("Maximum value was " + max);
    }
}

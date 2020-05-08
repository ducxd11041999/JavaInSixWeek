package w5;

public class RunThreads {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        
        threadGetTime threadRandom = new threadGetTime(sharedData);
        threadPrintSecond threadSquare = new threadPrintSecond(sharedData);
        
        threadSquare.start();
        threadRandom.start();
    }
}

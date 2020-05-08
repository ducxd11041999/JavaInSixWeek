package w5;

public class RunThreads {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        
        ThreadRandom threadRandom = new ThreadRandom(sharedData);
        ThreadPrime threadSquare = new ThreadPrime(sharedData);
        
        threadSquare.start();
        threadRandom.start();
    }
}

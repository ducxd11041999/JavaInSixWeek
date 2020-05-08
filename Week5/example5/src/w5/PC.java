package w5;

class PC {
    public static void main(String args[]) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}
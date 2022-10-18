package baitap2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread("số lẻ");
        EvenThread evenThread = new EvenThread("số chẵn");
        Thread thread = new Thread(oddThread);
        Thread thread1 = new Thread(evenThread);
        System.out.println("số lẻ là: ");
        thread.start();
        thread.join();
        System.out.println("số chẵn là:");
        thread1.start();
    }
}

package baitap1;

import baitap1.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread thread = new Thread(numberGenerator1);
        thread.start();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator2);
        thread1.start();
    }
}
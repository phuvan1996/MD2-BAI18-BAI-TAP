package baitap3;

public class LazyPrimeFactorization implements Runnable{

    @Override
    public void run() {
        System.out.println("số guyên tố là: ");
        int count = 0;
        int number = 2;
        while (count!=10){
            boolean check = false;
            for (int i = 2; i <number ; i++) {
                if (number%2==0){
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println(number);
                count++;
            }
            number++;
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

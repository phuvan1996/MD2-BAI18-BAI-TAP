package baitap1;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("10 số tự nhiên đầu tiên " +i+" "+ hashCode());
            try {
                Thread.sleep(500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

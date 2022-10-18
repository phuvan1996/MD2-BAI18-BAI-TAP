package baitap3;

public class OptimizedPrimeFactorization implements Runnable{
private int number;


    @Override
    public void run() {
        if (this.number<2){
            System.out.printf("%d không phải là số nguyên tố",this.number);
        }else {
            boolean check = true;
            for (int i = 2; i <Math.pow(this.number,0.5) ; i++) {
                if (this.number%i!=0){
                }else {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(+this.number+"là số nguyên tố");
            }else {
                System.out.println(+this.number+"không phải là số nguyên tố");
            }
        }
    }
}

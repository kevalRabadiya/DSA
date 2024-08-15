package basic;

import java.util.Scanner;

public class IncrementOne {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = 0;
        int temp = 0;

        while(num>0){
            int rem = num%10;
            m = m*10 + rem;
            temp = m++;
//            temp = m--   // use decrement 1
            num/=10;
        }

        num = m;
        m = 0;

        while(num>0){
            int rem = num%10;
            m = m*10 + rem;
            num/=10;
        }
        System.out.println(m);
    }
}

package Recurssion;

public class nthFibonachi {
    public static int fibonachi(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 50;
        int ans = fibonachi(n);
        System.out.println(ans);
    }
}

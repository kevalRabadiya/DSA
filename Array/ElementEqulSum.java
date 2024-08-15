package Array;

import java.util.HashMap;
import java.util.Scanner;

public class ElementEqulSum {
    static void solve(int []arr,int sum){
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int search = sum-arr[i];
            if(hash.containsKey(search)){
                System.out.println(arr[i]+ " " + search);
            }
            else {
                hash.put(i,arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,5,8,10,11};
        System.out.println("Enter num:");
        int n  = sc.nextInt();
        solve(arr,n);
    }
}

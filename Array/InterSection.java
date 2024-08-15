package Array;
import java.util.ArrayList;

public class InterSection {

    public static ArrayList<Integer> solve(int[] arr1, int[] arr2) {
        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    sum.add(arr1[i]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 4, 5, 6, 11};
        System.out.println(solve(arr1,arr2));
    }
}
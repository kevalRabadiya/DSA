package Array;
//Without Sorting
public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {23,56,76,88,89,45,13};
        int n = arr.length;
        int Highest = Integer.MIN_VALUE;
        int SecondHighest = Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            if(arr[i]>Highest){
                // Assign highest value into secondhigest
                SecondHighest = Highest;
//                Set new Highest
                Highest = arr[i];
            }

            if(arr[i]<Highest && arr[i]>SecondHighest){
                SecondHighest = arr[i];
            }
        }
        System.out.println(SecondHighest + " ");
    }
}

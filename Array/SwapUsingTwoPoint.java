package Array;

public class SwapUsingTwoPoint {
    public static void main(String[] args) {
        int[] arr ={8,7,6,5,4,3,2,1};
        int i=0,j= arr.length-1;
        System.out.println("--Before--");
        for (int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println("");
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("--After--");
        for (int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

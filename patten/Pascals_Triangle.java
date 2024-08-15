package patten;

public class Pascals_Triangle {
    public static void main(String[] args) {

        for(int i=0;i<6;i++){
            int num = 1;
            for( int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(num+" ");
                num = num * (i-k)/(k+1);
            }
            System.out.println(" ");
        }
    }
}

package patten;

//A
//A B A
//A B C B A
//A B C D C B A

public class Patten7 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            for (int j = 4; j >= 1; j--) {
                if (ch >= 'A') {
                    System.out.print(ch + " ");
                    ch--;
                }

            }
            ch = 'A';
            System.out.println("");
        }
    }
}

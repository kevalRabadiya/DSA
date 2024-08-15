package String;

public class RevSentence {
    public static void main(String[] args) {
        String str = "Hello world morning";
        String[] temp = str.split(" ");
        String ans = "";

        for(int i=temp.length-1;i>=0;i--){
            ans+=temp[i]+" ";
        }

//        for(int i=0;i< temp.length;i++){
//            System.out.println();
//        }
        System.out.println(ans);
    }
}

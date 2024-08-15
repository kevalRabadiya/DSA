package String;

import java.util.Stack;

public class RevEachWord {
    public static void reverseword(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();++i){
            if(str.charAt(i) !=' '){
                st.push(str.charAt(i));
            }
            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        // Since there may not be space after
        // last word.
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        String str = "My Name Is keval";
        reverseword(str);
    }
}

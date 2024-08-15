package String;
import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if(pattern.length()!=arr.length){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            char c = pattern.charAt(i);
            String a = arr[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(a)){
                    return false;
                }
            }else{
                if(map.containsValue(a)){
                    return false;
                }
                map.put(c,a);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String patten  = "abba";
        String str = "dog cat cat dog";
        boolean ans = wordPattern(patten,str);
        System.out.println(ans);
    }
}

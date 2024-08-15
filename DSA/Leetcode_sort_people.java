package DSA;

import java.util.*;

public class Leetcode_sort_people {
    public static class Pair{
        String name;
        int height;
        Pair(String name,int height){
            this.height = height;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        int[] height = {180,165,170};
        String[] name = {"Marry","John","Emma"};
        List<Pair> ans = new ArrayList<>();

//        add all pair
        for(int i=0;i< args.length;i++){
            ans.add(new Pair(name[i],height[i]));
        }

 //sorting the list according to decending order of the height -- custom sorting order
        ans.sort((a,b)->{
            return b.height-a.height;
        });

        String[] str = new String[ans.size()];

        for(int i=0;i< ans.size();i++){
            str[i] = ans.get(i).name;
            System.out.println(str[i]);
        }

    }
}

package DSA;

import java.util.*;

class HashSetDemo{
    //1 method
//    public static Integer getKeysByValue(HashMap<Integer, Integer> map, Integer value) {
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue().equals(value)) {
//               return entry.getKey();
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        //2 method
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        // 3 method

//        class Solution {
//            public int singleNumber(int[] nums) {
//                for (int i = 0; i < nums.length; i++) {
//                    int count = 0;
//                    for (int j = 0; j < nums.length; j++) {
//                        if (nums[i] == nums[j]) {
//                            count++;
//                        }
//                    }
//                    if (count == 1) {
//                        return nums[i];
//                    }
//                }
//                return -1;
//            }
//        }
    }
}

package com.leetCode.Adobe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int rem = target-nums[i];
            if(map.containsKey(nums[i])){
                ans[0]=map.get(nums[i]);
                ans[1]=i;
                break;
            }else{
                map.put(rem,i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int []ans = twoSum(arr, 9);
        Arrays.stream(ans).forEach(System.out::print);
    }
}

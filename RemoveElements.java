package com.leetCode;

import java.util.Arrays;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int p1 = 0;
       // int p2 = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= val){
                nums[p1] = nums[i];
                p1++;
            }
        }
        return p1;
        //Arrays.stream(nums).forEach(System.out::print);
        //return nums.length-p2-1;
    }

    public static void main(String[] args) {
        int []arr = {0,1,2};//{0,1,2,2,3,0,4,2};//{3,2,2,3};
        System.out.println("Ans:" +removeElement(arr, 2));
    }
}

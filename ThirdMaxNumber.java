package com.leetCode;

public class ThirdMaxNumber {

    public static int thirdMax(int[] nums) {
        int firstMax = nums[0];
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >firstMax){
                secondMax = firstMax;
                thirdMax = secondMax;
                firstMax = nums[i];
            }else if (firstMax>nums[i] && secondMax != nums[i]){
                if(nums[i]> secondMax){
                    thirdMax = secondMax;
                    secondMax = nums[i];
                }else if(thirdMax<nums[i] && secondMax!= nums[i]){
                    thirdMax = nums[i];
                }
            }
        }
        return thirdMax > Long.MIN_VALUE ? Math.toIntExact(thirdMax) : firstMax;
    }
    public static void main(String[] args) {
        int []arr = {2,2,3,1};
        System.out.println(thirdMax(arr));
    }
}

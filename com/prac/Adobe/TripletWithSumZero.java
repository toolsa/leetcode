package com.leetCode.Adobe;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
 and j != k, and nums[i] + nums[j] + nums[k] == 0.

 Notice that the solution set must not contain duplicate triplets.
*/

import java.util.*;

public class TripletWithSumZero {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            /*if(i> 0 && nums[i]==nums[i+1]){
                continue;
            }*/
            int start = i+1;
            int end = nums.length-1;
            while(start<end){

                /*if(end== nums.length-1 && nums[end]==nums[end-1]){
                    end--;
                    continue;
                }*/

                if(nums[i]+nums[start]+nums[end]==0){
                    List<Integer> sublst = Arrays.asList(nums[i], nums[start], nums[end]);
                    start++;
                    end--;
                    if(!lst.contains(sublst))
                        lst.add(sublst);
                }else if(nums[i]+nums[start]+nums[end]<0){
                    start++;
                }else{
                    end--;
                }

            }
        }
        return lst;
    }

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        threeSum(nums).stream().forEach(System.out::print);
    }
}

package com.leetCode;

public class MaxConsecutiveOnes {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int j = 0;
            int n = nums.length;
            int i  = 0;
            int ans = 0;
            if(n ==1){
                return (nums[0] ==1)? 1 :  0;
            }
            while(j<n){
                int num = nums[j];
                if (num<1){
                    i = j+1;
                }
                else if (num == 1){
                    //if(i!=j){
                        ans = Math.max(ans, j-i+1);
                    //}
                }
                j++;
            }
            return ans;
        }

        public static void main(String[] args) {
            //int []arr = {1,1,0,1};
            int []arr = {1,0};
            System.out.println(findMaxConsecutiveOnes(arr));
        }
}

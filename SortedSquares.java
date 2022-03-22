package com.leetCode;

import java.util.Arrays;

public class SortedSquares {

    public static int[] solve(int []arr){
        int left = 0;
        int n = arr.length;
        int  right = n-1;
        int num[] = new int[n];
        for (int i = n-1; i >= 0; i--) {
            if (Math.abs(arr[left]) > arr[right]){
                num[i] = arr[left] *arr[left];
                left++;
            }else{
                num[i] = arr[right] *arr[right];
                right--;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int []arr = {-4,-1,0,3,10};
        Arrays.stream(solve(arr)).forEach(System.out::print);
    }
}

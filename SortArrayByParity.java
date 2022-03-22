package com.leetCode;

import java.util.Arrays;

public class SortArrayByParity {

    public static void sort(int []arr){
        int n = arr.length;
        if (n<2) return ;
        int left = 0;
        int right = left+1;

        while(left < n && right < n){

            if(arr[left]%2!=0 && arr[right]%2==0){
                int temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp;
                //left++;
            }
            if(arr[left]%2!=0 && arr[right]%2!=0){
                right++;
            }else{
                left++;
                right++;
            }
        }

        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int []arr = {0,1,2};
        sort(arr);
    }
}

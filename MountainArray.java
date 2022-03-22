package com.leetCode;

public class MountainArray {

    public static boolean mountainArray(int []arr){
        int left = 0;
        int right  = arr.length -1;
        int n = arr.length-1;
        while(left <= n-1){
            if (arr[left] < arr[left+1])
                left++;
            else break;
        }
        if (left == n ) return false;

        while(right > 0){
            if (arr[right]< arr[right-1])
                right--;
            else
                break;
        }

        if(right == 0) return false;

        return left == right;
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(mountainArray(arr));
    }
}

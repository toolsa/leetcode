package com.leetCode;

import java.util.Arrays;

public class MinHeight {

    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int min = 0; int max =0;int r = 0;
        r = arr[n-1]-arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>=k){
                min = Math.min(arr[0]+k,arr[i]-k);
                max = Math.max(arr[n-1]-k, arr[i-1]+k);
                r = Math.min(r, max-min);
            }else
                continue;
        }
        return r;
    }

    public static void main(String[] args) {
        int Arr[] = {2,6,3,4,7,2,10,3,2,1};
        System.out.println(getMinDiff(Arr, Arr.length,5));

    }
}

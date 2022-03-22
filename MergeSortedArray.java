package com.leetCode;

import java.util.Arrays;

public class MergeSortedArray {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
     //   int i = m;
        int j = m+n-1;
        while(p2 >= 0){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[j] = nums1[p1];
                p1--;
            }else {
                nums1[j] = nums2[p2];
                p2--;
            }
        }
        Arrays.stream(nums1).forEach(System.out::print);
    }

    public static void main(String[] args) {
        //int [] nums1 = {1,2,3,0,0,0} ; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
        int [] nums1 = {0} ; int m = 0; int[] nums2 = {1}; int n = 1;
        merge(nums1, m, nums2, n);

    }
}

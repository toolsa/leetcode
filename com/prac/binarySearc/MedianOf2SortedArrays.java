package com.leetCode.com.prac.binarySearc;
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/


public class MedianOf2SortedArrays {

    public static double mergeSortedArray(int []arrX, int []arrY){

         if(arrX.length > arrY.length){
             return mergeSortedArray(arrY, arrX);
         }
         int x = arrX.length;
         int y = arrY.length;

         int low = 0;
         int high = x;
         while(low <= high){

             int partitionX = low + (high-low)/2;
             int partitionY = (x+y+1)/2 - partitionX;

             int maxLeftX = (partitionX==0) ?Integer.MIN_VALUE : arrX[partitionX-1];
             int minRightX= (partitionX==x) ? Integer.MAX_VALUE : arrX[partitionX];

             int maxLeftY = (partitionY==0)?Integer.MIN_VALUE :arrY[partitionY-1];
             int minRightY = (partitionY==y) ? Integer.MAX_VALUE:arrY[partitionY];

             if(maxLeftX<=minRightY && maxLeftY<=minRightX){
                if((x+y)%2==0){
                    return (double)(Math.max(maxLeftX,maxLeftY) +Math.min(minRightY,minRightX))/2;
                }else{
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
             }else if(maxLeftX > minRightY){
                 high = partitionX -1;
             }else{
                 low = partitionX +1;
             }
         }
         return -1d;
    }

    public static void main(String[] args) {
        int[]arrX = {1,3};
        int[]arrY = {2};
        System.out.println(mergeSortedArray(arrX, arrY));
    }
}

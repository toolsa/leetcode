package com.leetCode.Airbnb;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int []arr, int left, int right){
        if(left<right){
            int mid = left+ (right-left)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr, left,mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left +1;
        int n2 = right -mid ;

        int []LArray = new int[n1];
        int []RArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            LArray[i] = arr[left+i];
        }

        for (int i = 0; i < n2; i++) {
            RArray[i] = arr[mid+i+1];
        }
        int i = 0;
        int j = 0;
        int k =left;
        while(i < n1 && j< n2 ){
            if(LArray[i]<=RArray[j]){
                arr[k] = LArray[i];
                i++;
            }else{
                arr[k]= RArray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] =LArray[i];
            k++;
            i++;
        }

        while(j<n2){
            arr[k] =RArray[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 7, 1};
        sort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);
    }
}

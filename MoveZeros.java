package com.leetCode;

import java.util.Arrays;

public class MoveZeros {

    public static void solve(int []arr){
        //int i = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
          if (arr[i]!= 0){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              j++;
          }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int []arr =  {0,1,0,3,12};
        solve(arr);
    }
}

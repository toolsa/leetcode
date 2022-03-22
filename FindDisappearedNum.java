package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNum {

    public static void findDisappearedNumber(int []arr){
        List<Integer> missingNumber = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i])-1;
            if (arr[val] > 0){
                arr[val] = -arr[val];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
             //   if(i!=0)
                missingNumber.add(i+1);
            }
        }

        //porint arr
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println("missing number");
        missingNumber.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {2,2};
        findDisappearedNumber(arr);
    }
}

package com.leetCode;

public class FindNumOfEvenDig {

    public static int solve(int []arr){
        int count = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (Integer.toString(arr[i]).length() %2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr ={12,345,2,6,7896};
        System.out.println(solve(arr));
    }
}

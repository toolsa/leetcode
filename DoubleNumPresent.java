package com.leetCode;

import java.util.HashSet;

public class DoubleNumPresent {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet();
        for(int i = 0; i<arr.length;i++){
            int mul = arr[i]*2;
            int div = arr[i]/2;

            if(set.contains(mul) || (arr[i]%2 == 0 && set.contains(div))) return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr  = {0,0};
        System.out.println(checkIfExist(arr));
    }

}

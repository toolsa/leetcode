package com.leetCode;

public class DelDups {

    public static int removeDuplicates(int[] a) {
        //int i =0;
        int j =0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[n - 1];
        return j;
    }


    public static void main(String[] args) {
        int [] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}

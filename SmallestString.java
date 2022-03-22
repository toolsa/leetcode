package com.leetCode;

import java.util.Arrays;

public class SmallestString {

    public static char[] solve(int n, int k) {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        for (int i = n - 1; i >= 0; i--) {
            k -= i;
            // If k is a positive integer
            if (k >= 0) {
                // 'z' needs to be inserted
                if (k >= 26) {
                    arr[i] = 'z';
                    k -= 26;
                }
                // Add the required character
                else {
                    arr[i] = (char)(k + 97 - 1);
                    k -= arr[i] - 'a' + 1;
                }
            }
            else
                break;
            k += i;
        }
        return arr;
    }

    public static void main(String[] args) {
        char[] ch = solve(5,27);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(" "+ch[i]);
        }
    }
}

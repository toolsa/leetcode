package com.leetCode;

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int [] temp = new int [heights.length];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(temp);
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!= heights[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr = {1,1,4,2,1,3};
        heightChecker(arr);
    }
}

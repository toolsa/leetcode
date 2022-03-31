package com.leetCode.dp;

/*
**62
* There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
* The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or
*  right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
* */
public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        int [][]temp = new int[m][n];
        for (int i = 0; i < temp.length; i++) {
           temp[i][0]=1;
        }
        for (int i = 0; i < temp[0].length; i++) {
            temp[0][1]=1;
        }
        for (int i = 1; i < temp.length; i++) {
                for (int j = 1; j < temp[i].length; j++) {
                    temp[i][j] = temp[i-1][j] +temp[i][j-1];
                }
            }

        return temp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}

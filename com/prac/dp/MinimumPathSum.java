package com.leetCode.dp;

/*
* Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the
*  sum of all numbers along its path.
Note: You can only move either down or right at any point in time.
* Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

* */
public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        int [][] temp = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] += grid[i][j];
                if(i>0 && j>0){
                    temp[i][j] += Math.min(temp[i-1][j], temp[i][j-1]);
                }else if (i>0){
                    temp[i][j] += temp[i-1][j];
                }else if (j>0){
                    temp[i][j] += temp[i][j-1];
                }
            }
        }
        return temp[m-1][n-1];
    }

    public static void main(String[] args) {
        int [][]arr = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(arr));
    }
}

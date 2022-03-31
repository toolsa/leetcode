package com.leetCode.dp;

/*
* A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner
* of the grid (marked 'Finish' in the diagram below).
Now consider if some obstacles are added to the grids. How many unique paths would there be?
An obstacle and space is marked as 1 and 0 respectively in the grid.
* */
public class UniquePaths2 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int count = 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int [m+1][n+1];
        for (int i = 0; i < obstacleGrid.length; i++) {
            if(obstacleGrid[0][0]==1) return 0;
            //if(i==0){
                if(obstacleGrid[i][0]==0){
                    dp[i][0] =1 ;
                }else
                    break;
            //}

        }
        for (int j = 0; j < obstacleGrid[0].length; j++) {
           // if(j==0){
               if(obstacleGrid[0][j]==0){
                    dp[0][j] =1 ;
                }else
                    break;
            //}
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int [][] arr = {
                {0,0,0},{0,1,0},{0,0,0}
        };
       // int [][] arr = {{0,0},{0,1}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}

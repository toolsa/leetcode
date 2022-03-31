package com.leetCode.dp;
/*(5)
* Given a string s, return the longest palindromic substring in s.
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

* */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccd"));
    }

    public static String longestPalindrome(String s) {
        String revString = new StringBuilder(s).reverse().toString();
        return lcss(s,revString);
    }

    private static String lcss(String s, String revString) {
        int m = s.length();
        int n = revString.length();
        int temp[][] = new int[m+1][n+1];
        int ans = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if(s.charAt(i-1)==revString.charAt(j-1)){
                    temp[i][j] = temp[i-1][j-1] +1;
                }else {
                    temp[i][j] = 0 ;
                }
               // ans = Math.max(ans, temp[i][j]);
            }
        }

        int i=m;
        int j=n;
        StringBuilder str = new StringBuilder();
        while (i> 0 && j>0){
            if(s.charAt(i-1) ==revString.charAt(j-1)){
                str.append(s.charAt(i-1));
                i--;
                j--;
            }else{
                if(temp[i-1][j]>temp[i][j-1]) i--;
                else j--;
            }
        }
        return str.toString();

    }
}

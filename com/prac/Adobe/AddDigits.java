package com.leetCode.Adobe;
/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it
 */
public class AddDigits {
    //static  int sum =0;
    public static int addDigits(int num) {
        if(num>=0 && num<=9) return num;
        int sum =0;
        while(num!=0){
            int rem =  num%10;
            sum += rem;
            num = num/10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}

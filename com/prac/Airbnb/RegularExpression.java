package com.leetCode.Airbnb;
/*
* Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).
Example 1:
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

* */
public class RegularExpression {

    static char dot = '.';
    static char asterik = '*';
    public static boolean isMatch(String s, String p) {

        for (int i = 0; i < p.length(); i++) {
            if(s.charAt(i)==p.charAt(i) || p.charAt(i)== dot ){
                continue;
            }else if (p.charAt(i)==asterik){
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
       // System.out.println(isMatch("aa","a"));
       // System.out.println(isMatch("ab",".*"));
        //System.out.println(isMatch("ab","a*"));
        System.out.println(isMatch("aab","c*a*b"));
    }
}

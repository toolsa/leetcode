package com.leetCode.Adobe;
/*
Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.


        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
*/

import java.util.HashMap;
import java.util.Map;

public class LongestSubWoRepeatingChars {

    public static int lengthOfLongestSubstring(String str) {
        int mx = 0;
        int i =0;
        int j =0;
        int n = str.length();
        Map<Character, Integer> map = new HashMap<>();
        while(j<n){
            if(!map.containsKey(str.charAt(j))){
                map.put(str.charAt(j), 1);
            }else{
                int count = map.get(str.charAt(j)); count++;
                map.put(str.charAt(j),count);
            }
            if(j-i+1< map.size()){
                j++;
            }else if(j-i+1 == map.size()){
                mx = Math.max(mx, j-i+1);
            }
            if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    int count = map.get(str.charAt(i));
                    count--;
                    map.put(str.charAt(i),count);
                    if(map.get(str.charAt(i))==0) map.remove(str.charAt(i));
                    i++;
                }
                // j++;
            }
            j++;
        }
        return mx;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}

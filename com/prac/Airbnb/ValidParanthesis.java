package com.leetCode.Airbnb;

import java.util.Stack;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
*
* */
public class ValidParanthesis {
     Stack<Character> stack = new Stack<Character>();
    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char iString = s.charAt(i);
            if(stack.isEmpty()){
                if(iString == ')' || iString == '}' ||iString == ']') return false;
                else
                    stack.push(iString);
            }else{
                 if(iString == '(' || iString == '{' ||iString == '[')
                     stack.push(iString);
                 else if(iString == ')'&& !stack.isEmpty()&& stack.peek()=='('){
                     stack.pop();
                 }else if(iString == '}' && !stack.isEmpty()&& stack.peek()=='{'){
                     stack.pop();
                 }else if(iString == ']' && !stack.isEmpty()&& stack.pop()!='['){
                      stack.pop();
                 }
            }
        }
        return stack.isEmpty();
    }
}

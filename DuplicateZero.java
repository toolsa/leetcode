package com.leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DuplicateZero {

    public static  void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    public static void duplicate(int []arr){
        //PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
       // queue.add(arr[0]);
        int idx = 0;
       // long count = Arrays.stream(arr)..filter(x -> x==0).count();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== 0){
                queue.add(0);
                queue.add(0);
            }else{
                queue.add(arr[i]);
            }
            Integer first = queue.poll();
            arr[i]=first;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int []arr = {0,1,7,6,0,2,0,7}; //00176002
        duplicate(arr);
        //duplicateZeros(arr);
    }
}

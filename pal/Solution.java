package main.pal;
//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

//  Time Complexity: O(n)
// Space Complexity: O(1) by doing an "in place" rotation
public class Solution {
    public static void main(String[] args) {
        /* Save input */
       // Scanner scan = new Scanner(System.in);
        int size         = 7;
        int numRotations = 4;
        int array[] ={5,7,9,3,1,5,2};
       
        
        
        /* Rotate array (in place) using 3 reverse operations */
        numRotations %= size; // to account for numRotations > size
        int rotationSpot = size - 1 - numRotations;
        reverse(array, 0, size - 1);
        reverse(array, 0, rotationSpot);
        reverse(array, rotationSpot + 1, size - 1);
        
        /* Print rotated array */
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    /* Reverses array from "start" to "end" inclusive */
    private static void reverse(int [] array, int start, int end) {
        if (array == null || start < 0 || start >= array.length || 
            end < 0 || end >= array.length || start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int offset = i - start;
            swap(array, start + offset, end - offset);
        }
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

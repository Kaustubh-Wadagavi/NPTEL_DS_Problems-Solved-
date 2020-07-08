/*
Given an array of integers, print the array in such a way that the first element is first maximum and second element is first minimum and so on.

Examples :

Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4

Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4
*/

import java.io.*; 
import java.util.Arrays; 
   
class AlternativeSorting { 
    
    static void alternateSort(int arr[], int n) { 
        Arrays.sort(arr); 
        int i = 0, j = n-1; 

        while (i < j) { 
            System.out.print(arr[j--] + " "); 
            System.out.print(arr[i++] + " "); 
        } 
       
        if (n % 2 != 0) {
            System.out.print(arr[i]);
        } 
    } 
  
    public static void main (String[] args) 
    { 
        int arr[] = {1, 12, 4, 6, 7, 10}; 
        int n = arr.length; 
        alternateSort(arr, n); 
    } 
} 
/*
Sort an array in wave form

Given an unsorted array of integers, sort the array into a wave like array. An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

Example:

 Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
                 {20, 5, 10, 2, 80, 6, 100, 3} OR
                 any other array that is in wave form
*/

import java.util.*; 
  
class SortArrayInWaveform { 
    
    void swap(int arr[], int a, int b) { 
        int temp = arr[a]; 
        arr[a] = arr[b]; 
        arr[b] = temp; 
    } 
    void sortInWave(int arr[], int n) {  
        Arrays.sort(arr); 

        for (int i=0; i<n-1; i += 2) {
            swap(arr, i, i+1); 
        }
    } 
  
    public static void main(String args[]) { 
        SortArrayInWaveform ob = new SortArrayInWaveform(); 
        int arr[] = {10, 90, 49, 2, 1, 5, 23}; 
        int n = arr.length; 
        ob.sortInWave(arr, n); 
        for (int i : arr) {
            System.out.print(i + " "); 
        }
    } 
} 
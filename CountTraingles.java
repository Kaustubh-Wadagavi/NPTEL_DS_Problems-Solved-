/*

Count the number of possible triangles

Given an unsorted array of positive integers, find the number of triangles that can be formed with three different array elements as three sides of triangles. For a triangle to be possible from 3 values, the sum of any of the two values (or sides) must be greater than the third value (or third side).

Examples:

Input: arr= {4, 6, 3, 7}
Output: 3
Explanation: There are three triangles 
possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}. 
Note that {3, 4, 7} is not a possible triangle.  

Input: arr= {10, 21, 22, 100, 101, 200, 300}.
Output: 6

Explanation: There can be 6 possible triangles:
{10, 21, 22}, {21, 100, 101}, {22, 100, 101}, 
{10, 100, 101}, {100, 101, 200} and {101, 200, 300}
*/
import java.io.*; 
import java.util.*; 
   
class CountTraingles { 
    static int findNumberOfTriangles(int arr[], int n) {
        int count = 0; 
        
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { 
                for (int k = j + 1; k < n; k++) { 
                    if ( arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[k] + arr[j] > arr[i]) {
                        count++; 
                    }
                }
            } 
        } 
        return count; 
    } 
    
    public static void main(String[] args) { 
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 }; 
        int size = arr.length; 
      
        System.out.println( "Total number of triangles possible is : " + findNumberOfTriangles(arr, size)); 
    } 
} 
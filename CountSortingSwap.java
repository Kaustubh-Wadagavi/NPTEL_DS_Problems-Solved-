/*
Given a binary array, task is to sort this binary array using minimum swaps. We are allowed to swap only adjacent elements

Examples:

Input : [0, 0, 1, 0, 1, 0, 1, 1]
Output : 3
1st swap : [0, 0, 1, 0, 0, 1, 1, 1]
2nd swap : [0, 0, 0, 1, 0, 1, 1, 1]
3rd swap : [0, 0, 0, 0, 1, 1, 1, 1]

Input : Array = [0, 1, 0, 1, 0]
Output : 3

*/



class CountSortingSwap { 
      
    static int findMinSwaps(int arr[], int n) { 
        int noOfZeroes[] = new int[n]; 
        int i, count = 0; 
        noOfZeroes[n - 1] = 1 - arr[n - 1]; 
        for (i = n - 2; i >= 0; i--) { 
            noOfZeroes[i] = noOfZeroes[i + 1]; 
            if (arr[i] == 0) 
                noOfZeroes[i]++; 
        } 

        for (i = 0; i < n; i++) { 
            if (arr[i] == 1) {
                count += noOfZeroes[i]; 
            }
        } 
        return count; 
    } 

    public static void main(String args[]) { 
        int ar[] = { 0, 0, 1, 0, 1, 0, 1, 1 }; 
        System.out.println(findMinSwaps(ar, ar.length)); 
    } 
} 
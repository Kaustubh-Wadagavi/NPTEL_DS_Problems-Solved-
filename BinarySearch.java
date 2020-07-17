/*Given a character We have to find that string is Palindrome or not. 
By applying Binary Search Rule.
Example
Input: AABBAA
Output: Its a Palindrome

Input: AAAAbb
Output: Not Palindrome
*/

class BinarySearch{
    public static boolean checkPalindrome(char Arr[], int Size) {
        if(Arr == null || Size <= 0) {
            return false;
        }

        int iStart = 0;
        int iEnd = Size - 1;

        while(iStart <= iEnd) {
            if(Arr[iStart] != Arr[iEnd]) {
                return false;
            }
            iStart++;
            iEnd--;
        }
        return true;
    }

    public static void main(String args[]){
        char Arr[] = {'A','A','B','B','A','A'};
        boolean bRet = checkPalindrome(Arr, 6);

        if(bRet == true) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not Palindrome");
        }
    }
}
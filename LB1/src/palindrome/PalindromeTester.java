package palindrome;

public class PalindromeTester {

    //Author: Patrick Jurt
    //Date:   07.07.2021

    //Checks if a given char-Array contains a palindrome or not.
    //Iterative Method.
    public static boolean iterativeIsPalindrome(char[] chars) {

        //Initialize pointers
        int low = 0;
        int high = chars.length - 1;

        //As long as both pointers aren't in the middle of the array.
        //Returns false if the two chars that should match don't match.
        while (low < high) {
            if (chars[low] != chars[high]) {
                return false;
            }
            low++;
            high--;
        }

        //Return true if it runs through and no error has been found.
        return true;
    }


    //Checks if a given char-Array contains a palindrome or not.
    //Recursive Method.
    public static boolean recursiveIsPalindrome(char[] chars) {

        //If the array has a length of 1 or 0, the array is per se a palindrome.
        if (chars.length < 2) {
            return true;
        }

        //Checks the first and last char, returns false if they're not the same.
        if (chars[0] != chars[chars.length - 1]) {
            return false;
        }

        //Fills new array from the second to the second to last char.
        char[] newchars = new char[chars.length - 2];
        for (int i = 1; i < chars.length - 1; i++) {
            newchars[i - 1] = chars[i];
        }

        //Recursive Function call to check the newchars array.
        return recursiveIsPalindrome(newchars);
    }
}

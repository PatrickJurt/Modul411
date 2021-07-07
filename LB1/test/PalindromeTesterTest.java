import org.junit.jupiter.api.Test;
import palindrome.PalindromeTester;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTesterTest {

    //Author: Patrick Jurt
    //Date:   07.07.2021

    //For purposes of simplicity every test case is always tested with both
    //the iterative and recursive function, since one can distinguish easily
    //which function fails if there is an error in a test case.
    //One could make the argument to use separate test cases for both function,
    //however I decided against it.

    //The different test cases are described in the respective function-names.

    @Test
    void isPalindromeWithEmptyArrayYieldsCorrectReturnValue() {
        assertTrue(PalindromeTester.iterativeIsPalindrome(new char[]{}));
        assertTrue(PalindromeTester.recursiveIsPalindrome(new char[]{}));
    }

    @Test
    void isPalindromeWithOneValueYieldsCorrectReturnValue() {
        assertTrue(PalindromeTester.iterativeIsPalindrome(new char[]{'a'}));
        assertTrue(PalindromeTester.recursiveIsPalindrome(new char[]{'a'}));
    }

    @Test
    void isPalindromeWithTwoValuePalindromeYieldsCorrectReturnValue() {
        assertTrue(PalindromeTester.iterativeIsPalindrome(new char[]{'a', 'a'}));
        assertTrue(PalindromeTester.recursiveIsPalindrome(new char[]{'a', 'a'}));
    }

    @Test
    void isPalindromeWithTwoValueNotPalindromeYieldsCorrectReturnValue() {
        assertFalse(PalindromeTester.iterativeIsPalindrome(new char[]{'a', 'b'}));
        assertFalse(PalindromeTester.recursiveIsPalindrome(new char[]{'a', 'b'}));
    }

    @Test
    void isPalindromeWithBigPalindromeYieldsCorrectReturnValue() {
        assertTrue(PalindromeTester.iterativeIsPalindrome(new char[]{'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n'}));
        assertTrue(PalindromeTester.recursiveIsPalindrome(new char[]{'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n'}));
    }

    @Test
    void isPalindromeWithOddNumberPalindromeYieldsCorrectReturnValue() {
        assertTrue(PalindromeTester.iterativeIsPalindrome(new char[]{'a', 'b', 'c', 'b', 'a'}));
        assertTrue(PalindromeTester.recursiveIsPalindrome(new char[]{'a', 'b', 'c', 'b', 'a'}));
    }

    @Test
    void isPalindromeWithEvenNumberPalindromeYieldsCorrectReturnValue() {
        assertTrue(PalindromeTester.iterativeIsPalindrome(new char[]{'a', 'b', 'b', 'a'}));
        assertTrue(PalindromeTester.recursiveIsPalindrome(new char[]{'a', 'b', 'b', 'a'}));
    }

    @Test
    void isPalindromeWithOddNumberNotPalindromeYieldsCorrectReturnValue() {
        assertFalse(PalindromeTester.iterativeIsPalindrome(new char[]{'a', 'b', 'c', 'd', 'a'}));
        assertFalse(PalindromeTester.recursiveIsPalindrome(new char[]{'a', 'b', 'c', 'd', 'a'}));
    }

    @Test
    void isPalindromeWithEvenNumberNotPalindromeYieldsCorrectReturnValue() {
        assertFalse(PalindromeTester.iterativeIsPalindrome(new char[]{'a', 'b', 'd', 'a'}));
        assertFalse(PalindromeTester.recursiveIsPalindrome(new char[]{'a', 'b', 'd', 'a'}));
    }
}
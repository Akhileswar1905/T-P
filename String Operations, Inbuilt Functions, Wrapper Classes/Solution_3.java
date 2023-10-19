/*
Write a method that takes as parameter 1 String. The entire string is in lowercase.

If the string starts with f print Fizz. If the string ends with b return Buzz.
If both the f and b conditions are true, return FizzBuzz. In all other cases, print the string unchanged.

Test Case Examples:
---------------------
Input: fuel
Output: Fizz

Input: lob
Output: Buzz

Input: flab
Output: FizzBuzz

Input: goodness
Output: Goodness

*/
// Start writing your code from here

import java.util.*;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char a = str.charAt(0), b = str.charAt(str.length() - 1);
        if (a == 'f' && b == 'b') {
            System.out.println("FizzBuzz");
        } else if (a == 'f') {
            System.out.println("Fizz");
        } else if (b == 'b') {
            System.out.println("Buzz");
        } else {
            System.out.println(str);
        }
    }
}
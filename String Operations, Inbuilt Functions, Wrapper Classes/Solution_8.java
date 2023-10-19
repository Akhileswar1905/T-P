/*
/*Write a Java program to check whether the first instance of a given character is immediately 
followed by the same character in a given string.

Input Format: Read the string in first line.
              In the next line read the character that u want to check if it appeared consecutively in thr string.

Test Case Example:
----------------------
input= accommodation
m
output=
The given character 'm' appears consecutively in the string 'accommodation'

input=griet
e
output=No consecutive character present

*/

// Start writing your code from here

import java.util.*;

public class Solution_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        if (str.contains("" + ch + ch)) {
            System.out.printf("The given character '%c' appears consecutively in the string '%s'", ch, str);
        } else {
            System.out.println("No consecutive character present");
        }
        sc.close();
    }
}
/*
/*Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
Test Case Example:
----------------------
case=t1
input= ab5c2d4ef12s
output=                                              
The sum of the digits in the string is: 14

case=t2
input=abcdefg                                                                         
output=The sum of the digits in the string is: 0
*/

// Start writing your code from here

import java.util.*;

public class Solution_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += str.charAt(i) - '0';
            }
        }

        System.out.printf("The sum of the digits in the string is: %d", sum);
    }
}

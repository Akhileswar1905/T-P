/*
/*Write a Java program that reads an integer number (between 1 and 255) from the user and prints the binary representation of the number. 
The answer should be printed as a String.

Note: The output displayed should contain 8 digits and should be padded with leading 0s(zeros), in case the returned String contains less than 8 characters.

For example, if the user enters the value 16, then the output should be
 00010000

(Hint : You may use String.format() method for the expected output)
Test Case Example:
----------------------

input= 64
output=
01000000 


input=300
output=
Integer Number should be between 1 and 255 

*/
// Start writing your code from here

import java.util.*;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.close();
            if (n < 1 || n > 255) {
                throw new IllegalArgumentException("Integer Number should be between 1 and 255");
            } else {
                StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
                int bin = Integer.parseInt("" + str);
                System.out.printf("%08d", bin);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
/*
/*Write a Java program to create a String object out of a character array.

Input Format: Read 'n' number of characters to be created for array
              In next Line, enter each characters separated by space.
              In third line enter startindex and count on same line.
              where startindex is the position from which the characters to be extracted.
              count is the number of characters to be extracted from the startindex position.
              
Note: If the count exceeds the character array length, then print the following error message:
"Array boundary exceeded"

Test Case Example:
----------------------
input=5                           //Number of Characters
G R I E T
1 3                                //startindex is 3 and count is 1. Hence New String iS "RIE"
output=
New String: RIE

input=7
e g n 6 9 e z 
4 4
output=
Error: Array boundary Exceeded

*/

import java.util.*;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char[] ch = new char[n];
        String str = "";

        for (int i = 0; i < n; i++) {
            ch[i] = sc.next().charAt(0);
            str += ch[i];
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x + y > str.length()) {
            System.out.println("Error: Array boundary Exceeded");
        } else {
            System.out.printf("New String: %s", str.substring(x, x + y));
        }
    }
}
/*
/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

input format: Read the string(String must include firstname and lastname only separated by space) followed by n indicating character count to be extracted from the string.

To understand the question, Explore substring inbuilt function available in Java.

Test Case Example:
----------------------
input= Virat Kohli 3
output=hlihlihli

input=ARUN KUMAR 5
output=KUMARKUMARKUMARKUMARKUMAR

input=griet college java training 8
output=
Error: Input should have exactly 2 strings separated by a space

input=GRIET 2
output=
Error: Input should have exactly 2 strings separated by a space


*/

// Start writing your code from here

import java.util.*;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = str.charAt(str.length() - 1) - '0';
        StringTokenizer st = new StringTokenizer(str);
        if (st.countTokens() != 3) {
            System.out.println("Input should have exactly 2 strings separated by a space");
        } else {
            String s = str.substring(str.length() - 2 - n, str.length() - 2);
            // for(int i = 0;i<n;i++)
            // System.out.print(s);
            String res = new String(new char[n]).replace("\0", s);
            System.out.print(res);

        }
    }
}
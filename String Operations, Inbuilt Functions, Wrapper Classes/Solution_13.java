/*
/*A string is created by using another string's letters. Letters are case sensitive.
Write a Java program that checks the letters of the second string are present in the first string.
print true if present otherwise false.

Input format: Read two strings on the same line separated by space.

Test Case Example:
----------------------
input=grietcollege training
output=
false

input=ServiceBatchA BatchA  
output=true  
*/

// Start writing your code from here

import java.util.*;

public class Solution_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringTokenizer st = new StringTokenizer(str);
        if (("" + st.nextToken()).contains("" + st.nextToken())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
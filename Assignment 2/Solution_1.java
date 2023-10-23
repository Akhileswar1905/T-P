/*Write a Java program to check whether the entered two string are ended by the another string "et".

Input Format: Read two string separately on new line. The strings may be combination of substrings.

Test Case Example:
----------------------

input=griet
great
output=
"griet" ends with "et"? true
"great" ends with "et"? false
                      
case=t3
fail message="hidden test case"
input=griet street
carpet
output=
"griet street" ends with "et"? true
"carpet" ends with "et"? true

*/

// Start writing your code from here

import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String substr1 = str1.substring(str1.length() - 2, str1.length());
        String substr2 = str2.substring(str2.length() - 2, str2.length());
        System.out.printf("\"%s\" ends with \"et\"? %s\n", str1, "" + substr1.equals("et"));
        System.out.printf("\"%s\" ends with \"et\"? %s", str2, "" + substr2.equals("et"));
        sc.close();
    }
}
/*
/*Write a Java program that removes a specified word from given text. Return the updated string.

Input Format:
Read the main string in first line
Read the string tat needs to be removed from the main string.

use replace and replaceAll functions to achieve the desired result.

Output Format: print the updated string after removing the specified string.

Test Case Example:
----------------------
input=griet Training                                                              
ing 
output=
griet Train  
*/

// Start writing your code from here
import java.util.*;

public class Solution_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String substr = sc.nextLine();
        sc.close();
        str = str.replace(substr, "");
        System.out.println(str);
    }
}
/*
/*Write a Java program to count the number of characters(any character except '*')
that occur more than twice in a given string.

Input format:
Read a String from input

Explanation:
initialize variable count to '0'.
Check length of the String greater than '0' in while loop,
set the duplicates of selected character by ', ' by using replaceAll method  to mark them as visited.
if the length of selected character with rest of the characters present in the string is greater than 2 
then increases the count by 1
return the count.

Note: if the user enters the character * then print the error message as:
Error: Star character is not allowed.


Test Case Example:
----------------------
input=abaa
output=
Number of duplicate characters in the String: 1               //since a is appearing more than twice hence count is 1.

Example:1
input= COOK book                                 // Check Case(capital & small 'o')                                         
Output=
Number of duplicate characters in the String: 0

Example:2
input=abbacdbabcc
output=
Number of duplicate characters in the String: 3

input=@1@%@5#&2##
output=
Number of duplicate characters in the String: 2                     //@ and # are repeating more than twice

input=super*
output=Error: Star character is not allowed

*/

// Start writing your code from here

import java.util.*;

public class Solution_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.nextLine();
            sc.close();
            if (str.contains("*")) {
                throw new IllegalArgumentException("Error: Star character is not allowed");
            } else {
                System.out.printf("Number of duplicate characters in the String: %d", check(str));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int check(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int c = 0;
        for (char ch : map.keySet()) {
            if (map.get(ch) > 2 && ch != ' ')
                c++;
        }

        return c;
    }
}

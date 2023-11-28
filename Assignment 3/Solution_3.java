/* Write a Java Program to check next smallest beautiful number from the given number !!
A number is called beautiful if, for every digit x in the number, there are x occurrences of it in the number.
Example: 
1 is beautiful because 1 has 1 occurrence. 3133 is beautiful because 1 has 1 occurrence and 3 has 3 occurrences.
224 is not beautiful because 4 does not have 4 occurrences. 

Note:Implement all the invalid cases given in the sample test cases using exception handling!!

Test case examples:
-----------------------
input=267
output=The smallest beautiful number greater than 267 is: 333

input=1345
output=The smallest beautiful number greater than 1345 is: 3133

input=0
output=Zero is not allowed as input.


input=ARUN1661
output=
Invalid input. Please enter a valid integer.

*/
// Start writing your code from here

import java.util.*;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.close();

            if (n == 0) {
                System.out.println("Zero is not allowed as input.");
                return;
            } else if (n < 0) {
                System.out.println("Invalid input. Please enter a valid integer.");
                return;
            } else {
                int x = findSmall(n);
                System.out.println(x);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    public static int findSmall(int n) {
        while (true) {
            n++;
            if (check(n))
                return n;
        }
    }

    public static boolean check(int n) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "" + n;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) != Character.getNumericValue(ch))
                return false;
        }
        return true;
    }
}
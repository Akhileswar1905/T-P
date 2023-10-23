/* Write a Java Program to check if a given number is beautiful number or not!!
You are given a number N. A number is called beautiful if, for every digit x in the number, there are x occurrences of it in the number.
Example: 
1 is beautiful because 1 has 1 occurrence. 3133 is beautiful because 1 has 1 occurrence and 3 has 3 occurrences.
224 is not beautiful because 4 does not have 4 occurrences. 

Note:Implement all the invalid cases given in the sample test cases using exception handling!!

Test case examples:
-----------------------
input=122
output=122 is a beautiful number

input=12342
output=12342 is not a beautiful number

input=ARUN777
output=
Invalid input. Please enter a valid integer.

input=0
output=Zero is not allowed as input.

input=12032
output=
The number cannot contain zero in between the digits.

*/
// Start writing your code from here

import java.util.*;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.close();
            if (n == 0) {
                throw new IllegalArgumentException("Zero is not allowed as input");
            }

            HashMap<Character, Integer> map = new HashMap<>();
            String str = "" + n;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '0') {
                    throw new IllegalArgumentException("The number cannot contain zero in between the digits.");
                }
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            for (char ch : map.keySet()) {
                if (ch - '0' != map.get(ch)) {
                    System.out.printf("%d is not a beautiful number", n);
                    return;
                }
            }
            System.out.printf("%d is a beautiful number", n);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

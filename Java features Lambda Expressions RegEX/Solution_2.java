/*
/*Write a Java program to implement a lambda expression to check if a given string is a palindrome.

Test Case Example:
----------------------
input=madam
output=
madam is a palindrome? true

input=ar77ra
output=
ar77ra is a palindrome? true

input=1254
output=
1254 is a palindrome? false

*/

import java.util.*;
import java.util.function.Predicate;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Predicate<String> isPalindrome = (s) -> {
            String sb = new StringBuilder(s).reverse().toString();
            return s.equalsIgnoreCase(sb.toString());
        };

        System.out.println(str + " is a palindrome? " + isPalindrome.test(str));
        sc.close();
    }
}

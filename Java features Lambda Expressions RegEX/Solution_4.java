/*
/*Write a Java program to separate consonants and vowels from a given string. ignore the case.

Note: if the string contains numbers print the following error message:

"The String should not contain numbers"

Test Case Example:
----------------------
input=ARUNKUMAR1661
output=
The String should not contain numbers

input=GRIET COLLEGE
output=
Vowels: IEOEE
Consonants: GRT CLLG

*/

// Start writing your code from here

import java.util.*;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.matches(".*\\d.*")) {
            System.out.println("The String should not contain numbers");
            return;
        }

        String a = str.replaceAll("[^aeiouAEIOU]", "");
        String b = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Vowels: " + a);
        System.out.println("Consonants: " + b);

    }
}
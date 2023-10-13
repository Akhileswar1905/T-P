/*
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value". If long int range exceeds, print the error message as:
Long int range exceeded.

Otherwise, if the parameter is valid then it needs to print a message in the format for example:
1440 minutes  = 0 Years  and 1 days

Test case example:
input= 1440
output=
1440 minutes  = 0 Years  and 1 days

input=
98765434543213435664566
output=
Long int range exceeded.

*/
// Start writing your code from here

import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            long n = sc.nextLong();
            sc.close();
            if (n < 0) {
                System.out.println("Invalid Value");
                return;
            }
            printYearsAndDays(n);
        } catch (Exception e) {
            System.out.println("Long int range exceeded.");
        }
    }

    public static void printYearsAndDays(long n) {
        long days = n / 1440, years = 0;
        if (days >= 365) {
            years = days / 365;
            days = days % 365;
        }

        System.out.printf("%d minutes = %d Years and %d days", n, years, days);
    }
}
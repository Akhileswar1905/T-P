/*First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number. 
The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and 
the last digit of that number.
If the number is negative then the method needs to throw user defined exception IllegalArgumentException with the following message.
Input number cannot be negative. Use the try and catch block in the main function to implement the exception.

Explaination:
-------------------
sumFirstAndLastDigit(252)→ should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
sumFirstAndLastDigit(257)→ should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
sumFirstAndLastDigit(0)→ should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
sumFirstAndLastDigit(5)→ should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
sumFirstAndLastDigit(-10) → should print Input number cannot be negative.
sumFirstAndLastDigit(00456) -> should return 10, since zeroes in the beginning are ignored so 6+4 = 10.

Test case examples:
-------------------
input=456
output=
Sum of first and last digits: 10

input=00123
output=
Sum of first and last digits: 4

input=
-4567
output=
Error: Input number cannot be negative

input=3456756453425467
output=
Error: Input is not a valid integer or Max Integer value is reached.

*/
// Start writing your code from here

import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.close();
            if (n < 0) {
                System.out.println("Error: Input number cannot be negative.");
                return;
            }
            int f = ("" + n).charAt(0) - '0';
            int sum = (n % 10) + f;
            System.out.printf("Sum of first and last digits: %d", sum);

        } catch (Exception e) {
            System.out.println("Error: Input is not a valid integer or Max Integer value is reached.");
        }

    }
}
/* Largest Prime Factor
------------------------------
Write a method named LargestPrime with one parameter of type int named number. 

Implement the following error Handling conditions through Exception Handling InputMismatchException:

1. If the number is < 0 print: Invalid Input: Please enter a non-negative number.
2. If the number is 0 or 1 print: Invalid Input: 0 & 1 Neither a Prime Nor a Composite numbers.
3. If the number is not an integer or exceeds the range of integer values print the message:
                 Invalid Input: Please enter a valid integer.

Note: There should be a single catch block to handle all the above errors.

Explaination:
-----------------
LargestPrime(21); should return 7 since 7 is the largest prime (3 * 7 = 21)
LargestPrime(217); should return 31 since 31 is the largest prime (7 * 31 = 217)
LargestPrime(45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

Test cases:
-----------------
input=219
output=The Largest Prime Factor of 219 is: 73

input=567
output=The Largest Prime Factor of 567 is: 7

input=Arun777
output=
Invalid Input: Please enter a valid integer.


*/
// Start writing your code from here

import java.util.*;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.close();
            if (n < 0) {
                throw new IllegalArgumentException("Invalid Input: Please enter a non-negative number.");
            }

            if (n == 1 || n == 0) {
                throw new IllegalArgumentException("Invalid Input: 0 & 1 Neither a Prime Nor a Composite numbers.");
            }
            int x = LargestPrime(n);
            System.out.printf("The Largest Prime Factor of %d is: %d", n, x);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int LargestPrime(int n) {
        int lar_prime = 2;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                if (lar_prime < i) {
                    lar_prime = i;
                }
            }
        }
        return lar_prime;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


/*
Write a java method named SharedDigit with two parameters of type int. 

Constraints: Each number should be within the range of 10 to 99.
If one of the numbers is not within the range, the method should throw Error Message as:
Input numbers must be between 10 and 99.

The method should return true if there is a digit that appears in both numbers, such as 2 in 25 and 42; otherwise, the method should 
print message: No Shared Digit Exists.

TEST CASE EXAMPLES:
--------------------
input=67
78
output=Shared Digit Exists

input=345
13
output=
Exception in thread "main" java.lang.RuntimeException: Input numbers must be between 10 and 99.
	at Solution.main(Solution.java:29)
	
*/
// Start writing your code from here
import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if (x > 99 || x < 10 || y > 99 || y < 10) {
            throw new RuntimeException("Input numbers must be between 10 and 99.");
        }
        if (sharedDigit(x, y)) {
            System.out.println("Shared Digit Exists");
        } else {
            System.out.println("No Shared Digit Exists.");
        }
    }

    public static boolean sharedDigit(int x, int y) {
        int a = x / 10, b = x % 10, c = y / 10, d = y % 10;
        return a == c || a == c || b == c || b == d;
    }
}

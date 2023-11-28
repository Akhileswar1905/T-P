/*smallest reduced integer.
--------------------------
Given a input number and K. reduce it to smallest integer possible based on K

input=149811 3
output=111

input=1002991 3                       //here after removing 3 digits which are 1,9,9 the remaining digit is 0021,    after omitting 00, final output is 21. 
output=21

input=10002134 4
output=1

input: 4567 2
output=45


Hint:
read the input number using stringbuilder or string class.

step 1: if number length is equal to K return 0.
convert the input string to char array

step 2:
use a loop to check if k > 0 and are u within the boundary of string array
{
   compare each digit and last digit, if each digit is less than last digit, delete the the last digit,
   and decrement k and go back to loop as long as the condition is true and k > 0 and resulting string is greater than zero)
}

step 3:if input contains zeroes inbetween ignore them and append only numbers to the
resulting string.

step 4: If there are still remaining digits to remove (k > 0) after processing all digits, remove the last k digits from the result.

*/

import java.util.Scanner;

public class Solution_4 {
    public static String reduceToSmallest(int num, int k) {
        String numStr = Integer.toString(num);
        int len = numStr.length();

        if (len == k) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (char digit : numStr.toCharArray()) {
            while (k > 0 && result.length() > 0 && digit < result.charAt(result.length() - 1)) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            result.append(digit);
        }

        int start = 0;
        while (start < result.length() && result.charAt(start) == '0') {
            start++;
        }
        result = new StringBuilder(result.substring(start));

        if (k > 0) {
            result = new StringBuilder(result.substring(0, result.length() - k));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(reduceToSmallest(n, k));
    }
}

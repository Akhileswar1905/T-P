/*Write a java program to create Criss Cross Pattern as shown in the test case below.

Constraints: Read the number of Rows from user. If the number is less than 5, print error message as:
               "Input number can't be less than 5"

For each row or column, stars (*) are printed based on four conditions:
----------------------------------
1. First and last Row
2. First and Last Column
3. When Rownumber==ColumnNumber
4. When the ColumNnumber equals TotalNumber of Rows - currentRow + 1 (where currentRow is current row number)

//Use the Given Class Structure and implement the method pattern. Access the ErrorMessage String from the pattern method.

Sample Test Cases:
----------------------
input=5
output=
*****
** **
* * *
** **
*****

input=15
output=
***************
**           **
* *         * *
*  *       *  *
*   *     *   *
*    *   *    *
*     * *     *
*      *      *
*     * *     *
*    *   *    *
*   *     *   *
*  *       *  *
* *         * *
**           **
***************

*/
// Start writing your code from here

import java.util.*;

public class Solution_8 {

    static String ErrorMessage = "Input number can't be less than 5";

    public static void main(String[] args) {
        // Call the pattern method with input number of rows
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }

    public static void pattern(int n) {
        // Complete the code
        try {
            if (n < 5) {
                throw new IllegalArgumentException(ErrorMessage);
            }
            // Line 1
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            int j;
            for (int i = 0; i < (n - 2) / 2; i++) {
                // Star 1
                System.out.print("*");

                // Spaces
                for (j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                // Star 2
                System.out.print("*");

                // Spaces
                for (int k = j + 2; k < n - j - 2; k++) {
                    System.out.print(" ");
                }

                // Star 3
                System.out.print("*");

                for (int k = n - j - 2; k < n - 2; k++) {
                    System.out.print(" ");
                }

                // Star 4
                System.out.print("*");
                System.out.println();
            }

            for (int i = 0; i < 1; i++) {
                System.out.print("*");
                for (j = 0; j < (n / 2) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = n - j - 2; k < n - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }

            for (int i = ((n - 2) / 2) - 1; i >= 0; i--) {
                // Star 1
                System.out.print("*");

                // Spaces
                for (j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                // Star 2
                System.out.print("*");

                // Spaces
                for (int k = j + 2; k < n - j - 2; k++) {
                    System.out.print(" ");
                }

                // Star 3
                System.out.print("*");

                for (int k = n - j - 2; k < n - 2; k++) {
                    System.out.print(" ");
                }

                // Star 4
                System.out.print("*");
                System.out.println();
            }

            // Line N
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Access ErrorMessage From here
    }
}

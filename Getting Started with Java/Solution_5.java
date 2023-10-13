/* Generate Fibanacci series using dynamic programming:
--------------------------------------------------------------
Dynamic programming is a technique that breaks the problems into sub-problems, 
and saves the result for future purposes so that we do not need to compute the result again. 
The subproblems are optimized to optimize the overall solution.
The main use of dynamic programming is to solve optimization problems.

Test case examples:
-----------------
input=10
output=Fibonacci sequence with 10 terms: 0 1 1 2 3 5 8 13 21 34

case=t2
input=1
output=Fibonacci sequence with 1 terms: 0


*/

import java.util.*;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        fibSeries(n);
    }

    public static void fibSeries(int n) {
        int[] fib = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Fibonacci sequence with " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}

/*
/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7(ignore 6&7 as well) 
and consider the other numbers for calculation of sum.

Input Format: Enter the number of elements in array followed by the elements.
Output Format: Sum of all the numbers between 6 and 7 in succeeding order.


Test Case Examples:
---------------------
input=7
6 1 200 3 7 5 5
output=
Sum of elements: 10

input=5
100 6 200 300 7
output=
Sum of elements: 100

input=7
6 6 6 6 6 6 6
output=
Sum of elements: 0

input=5
6 1 2 3 7
output=
Sum of elements: 0
*/
// Start writing your code from here

import java.util.*;;

public class Solution_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];
        boolean yup = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if ((arr[i] == 6)) {
                yup = true;
            } else if (yup && arr[i] == 7) {
                yup = false;
            } else if (!yup) {
                sum += arr[i];
            }
        }
        sc.close();
        System.out.println("Sum of elements: " + sum);

    }
}
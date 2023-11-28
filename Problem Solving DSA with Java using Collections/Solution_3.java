
/*
Given an arraylist of size n, Write a function int harmonyIndex(int[] arr, int n) that returns harmony index (if any) or -1
if no such  index exists. 

The harmony index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 

Test Case example:
---------------------
input=5
3 2 5 3 2
output=
Harmony Index: 2


Test cases:
--------------
*/
//write your code below
import java.util.*;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("Harmony Index: %d", harmonyIndex(arr, n));
    }

    public static int harmonyIndex(int[] arr, int n) {

        int sum = 0, lsum = 0;
        for (int i : arr) {
            sum += i;
        }
        for (int i = 0; i < n - 1; i++) {
            sum -= arr[i];
            if (lsum == sum)
                return i;
            lsum += arr[i];
        }
        return -1;
    }
}
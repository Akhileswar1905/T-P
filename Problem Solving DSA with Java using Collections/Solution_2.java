/*
/* Given an array arr[] of size N having integer elements,
return the maximum continuous increasing prime sum.

test Case Example:
input=8
3 2 5 6 3 7 11 9
output=
Maximum continuous increasing prime sum is 21

*/
// Start writing your code from here

import java.util.*;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }

        boolean[] primes = primeNums(max + 1);
        int sum = primes[arr[0]] ? arr[0] : 0;
        int maxSum = sum;
        for (int i = 1; i < n; i++) {
            // System.out.println(sum+" "+maxSum);
            if (arr[i - 1] <= arr[i] && primes[arr[i]]) {
                sum += arr[i];
                maxSum = Math.max(maxSum, sum);
            } else {
                sum = primes[arr[i]] ? arr[i] : 0;
            }
        }
        System.out.println("Maximum continuous increasing prime sum is " + maxSum);
    }

    public static boolean[] primeNums(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i)
                    primes[j] = false;
            }
        }

        return primes;
    }
}

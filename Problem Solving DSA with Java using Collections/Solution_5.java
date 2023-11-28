/*
Given an array A of N elements. Find the Winning Candidate element in the array.
A WinningCandidate element in an array A of size N is an element that appears strictly more than N/2 times in the array.

Test Case example:
---------------------
input=5
3 1 3 3 2
output=
Winning Candidate: 3



Test cases:
--------------
*/
//write your code below

import java.util.*;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
                if (map.get(x) > n / 2) {
                    System.out.println("Winning Candidate: " + x);
                    return;
                }
            } else {
                map.put(x, 1);
            }
        }
        System.out.println("No Such Candidate");
    }
}

/*
/*Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.


Test Case Example:
----------------------
Input=
4                                   //(Size of list)
9 36 -32 0 
Output=
[9, 36, -32, 0]
Maximum value: 36
Minimum value: -32

input= 0
output=
[]
Maximum Value: 0
Minimum Value: -1

*/

// Start writing your code from here

import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        int max = list.stream().mapToInt(x -> x).max().orElse(0);
        int min = list.stream().mapToInt(x -> x).min().orElse(-1);
        System.out.println(list.toString());
        System.out.println(max);
        System.out.println(min);
        sc.close();
    }
}
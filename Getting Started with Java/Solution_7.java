/*The Utopian Tree goes through 2 cycles of growth every year.
Each spring, it doubles in height. 
Each summer, its height increases by 1 meter.
A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. 
How tall will the tree be after n growth cycles?
For example, if the number of growth cycles is 5, the calculations are as follows:

Period  Height
---------------
0  	      1         //planted at onset of spring
1         2
2         3
3         6        //doubles in spring (2 cycles)
4         7
5         14

Test cases:
input=5
output=14

*/
// Start writing your code from here

import java.util.*;

public class Solution_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n % 2 != 0) {
            System.out.printf(
                    "Height of tree after %d cycles = %d meters", n, (int) (Math.pow(2, (n / 2 + 2)) - 2));
        } else {
            System.out.printf(
                    "Height of tree after %d cycles = %d meters", n, (int) (Math.pow(2, (n / 2 + 1)) - 1));
        }
    }
}
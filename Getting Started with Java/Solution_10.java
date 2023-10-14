/*Akhil has many balls of white and black colors. One day, he was playing with them. 
During the play, he arranged the balls into two rows both consisting of N number of balls. 
These two rows of balls are given to you in the form of strings X, Y. Both these string consist of ‘W’ and ‘B’,
where ‘W’ denotes a white colored ball and ‘B’ a black colored.

Other than these two rows of balls, Akhil has an infinite supply of extra balls of each color. 
he wants to create another row of N balls, Z in such a way that the sum of hamming distance between X and Z, 
and hamming distance between Y and Z is maximized.

Hamming Distance between two strings X and Y is defined as the number of positions where the color of balls in row X
differs from the row Y ball at that position.

e.g. hamming distance between “WBB”, “BWB” is 2, as at position 1 and 2, corresponding colors in the two strings differ..

As there can be multiple such arrangements of row Z, Akhil wants you to find the lexicographically smallest arrangement 
which will maximize the above value.

Sample Example 
input:
WBWB
WBBB
Output:
BWBW

Explanation:
----------------
Hamming Distance(WBWB, BWBW) = 4
Hamming Distance(WBBB, BWBW) = 3
The above arrangement will maximize the hamming distance 4+3 = 7 
You can try any other value for string Z, it will never exceed 6. Hence the best arrangement is BWBW

// Start writing your code from here

*/

import java.util.*;

public class Solution_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = "";
        sc.close();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                if (b.charAt(i) == 'W')
                    c += 'B';
                else
                    c += 'W';
            } else {
                c += 'B';
            }
        }

        System.out.println(c);
    }
}
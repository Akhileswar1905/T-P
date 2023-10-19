/*
/*Write a Java program that reverses all odd-length words in a string.

Input format: Read a string with spaces.
output format: A single string with reversed data.


Test Case Example:
----------------------
input=Griet college
output=
teirG egelloc

input= 12345 call
output=
54321 call

*/

// Start writing your code from here
import java.util.*;

public class Solution_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String s = "" + st.nextToken();
            if (s.length() % 2 != 0) {
                StringBuilder sb = new StringBuilder(s);
                sb.reverse();
                System.out.print(sb + " ");
            } else {
                System.out.print(s + " ");
            }
        }
        sc.close();
    }
}
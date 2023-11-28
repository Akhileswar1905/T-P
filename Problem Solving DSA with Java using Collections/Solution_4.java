/* Given a 2D array of strings, with each row containing a name pair,
you have to print the number of unique name pairs up till that point.

test case example:
-----------------------
input=
4
arun ck
virat kohli 
arun ck
rohit sharma

output=
1
2
2
3

Explaination: for 1st row unique string is 1, 2nd row its updated to 2, third row its still 2 as the string is already repeated and so on.

*/
// Start writing your code from here

import java.util.*;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (!map.containsKey(str)) {
                c++;
                map.put(str, 1);
            }
            System.out.println(c);
        }

    }
}
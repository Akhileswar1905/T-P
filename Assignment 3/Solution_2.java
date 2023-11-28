/* 
Given n number of integer values in arraylist, find the 2nd smallest and 2nd largest element in the arraylist
ignoring the duplicated values.

Input format: read 'n' then read n number of integer values.

Note: Implement the error handling situations as mentioned in the test cases:

Test case examples:
-----------------------
input=
7
3 7 5 45 78 78 10
output=
Second Largest Element: 45       //here 78 is duplicated, hence 2nd smallest element is 45
Second Smallest Element: 5

input=4
166 4 89 griet                                                  //enter only integer values error
output=
Invalid input. Please enter an integer.

input=4
10 10 10 10
output=
Atleast 2 unique elements are required                //since all are 10, to find 2nd largest and 2nd smallest atleast 2 unique values are needed.

input=0
output=
Atleast 2 unique elements are required                      //n itself is 0.



*/
// Start writing your code from here

import java.util.*;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            set.add(num);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int x : set) {
            arr[i++] = x;
        }
        Arrays.sort(arr);
        System.out.println(arr[1] + " " + arr[arr.length - 2]);
        sc.close();
    }
}
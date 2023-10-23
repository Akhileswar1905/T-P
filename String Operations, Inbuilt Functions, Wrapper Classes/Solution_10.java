/*
/*
Initialize an integer Array with n elements.(elements can contain negative values) 

Sort only certain element of the array based on the following indexes:
start index: sort from the position of start index.
end index: sort upto to end index - 1 i.e except the end index.

Note: If the end Index exceeds the integer array length, then print the following error message:
"Array boundary exceeded"

Test Case Example:
----------------------
input=6
6 5 4 3 2 1
2                                      //start index is 2
5                                      //end index 5
output=
After sorting: [6, 5, 2, 3, 4, 1]       //elements are sorted from position 2 to 4 excluding 5

Example-2
input= 8                                                                               
45 8 5 32 1 0 -3 5                                                              
9
output=
Error: Array Boundary exceeded

*/

// Start writing your code from here

import java.util.*;

public class Solution_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        if (a > n || a < 0) {
            System.out.println("Error: Array Boundary exceeded");
            return;
        }
        int b = sc.nextInt();
        if (b > n) {
            System.out.println("Error: Array Boundary exceeded");
            return;
        }
        sc.close();

        if (a >= 0 && a < arr.length) {
            Arrays.sort(arr, a, b);
            // System.out.print("After sorting: [");
            // for (int i = 0; i < arr.length; i++) {
            // if (i == arr.length - 1) {
            // System.out.print(arr[i]);
            // } else
            // System.out.print(arr[i] + ", ");
            // }
            // System.out.print("]");
            System.out.println(Arrays.toString(arr));
        }

    }
}
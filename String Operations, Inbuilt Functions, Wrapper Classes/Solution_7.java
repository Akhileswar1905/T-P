/*
/*Write a Java program to create a new string after removing character 't'
character from a given string. This is except the first and last position.


Test Case Example:
----------------------
case=t1
input= Country 
output=
The new string is: Counry


case=t2
input=Statutory   
output=
The new string is: Sauory  


*/

// Start writing your code from here

import java.util.*;

public class Solution_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("The new string is: ");
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 't') && (i == 0 || i == str.length() - 1)) {
                System.out.print('t');
            } else if (str.charAt(i) != 't' && str.charAt(i) != 'T') {
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}

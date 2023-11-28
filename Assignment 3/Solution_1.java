/* 
Given a string, insert (dash) i.e - before and after every vowel in the string.
If the string contains numbers, insert * before and after every digit in the string.

Assume no other characters appear in the given string except alphabets and numbers.

Testcase examples:
---------------------------
input=Arunkumar 1CSE6                                                                 
output=
-A-r-u-nk-u-m-a-r *1*CS-E-*6*  

input=Griet College 50085                                                             
output=
Gr-i--e-t C-o-ll-e-g-e- *5**0**0**8**5* 

*/
// Start writing your code from here

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.replaceAll("([aeiouAEIOU])", "-$1-");
        result = result.replaceAll("([0-9])", "*$1*");
        System.out.println(result);
        
        sc.close();
    }
}
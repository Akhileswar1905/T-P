/* Write a Java Program to find the minimum number of bits required to represent the
given integer number. with the following exception handling:

if the input is negative throw IllegalArgumentException with the following error message:
"Please enter a positive integer"

if the input is invalid or exceeds the integer range throw IllegalArgumentException with the error message:
"Wrong input. Please enter a valid integer"

To handle above exceptions there should be single catch and try block.

Test case example:
----------------------
input=
13
output=
Total number of bits required = 4

input=abc100
output=Wrong input. Please enter a valid integer.
*/

//start writing your program from next line

import java.util.Scanner;

public class Solution_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            if(n<0){
                System.out.println("Please enter a positive integer.");
                return;
            }
            String s = "";
            while(n>0){
                s += n%2;
                n/=2;
            }
            System.out.printf("Total number of bits required = %d",s.length());
        }catch(Exception e){
            System.out.println("Wrong input. Please enter a valid integer.");
        }
        sc.close();
    }
}
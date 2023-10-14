/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

Note: Students need not to enter any input, values to be fetched from command line which is already given in the test cases.

Test case examples:
--------------------
input=
output=the percentage of interest is 10.5%    (in this case, the first argument in Male and age is >= 58)

input=
output=the percentage of interest is 8.2%    (in thi case, the first argument is Female and the age is <= 58)
*/

public class Solution_9 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        if (args[0].equals("Female")) {
            if (age >= 1 && age <= 58)
                System.out.println("the percentage of interest is 8.2%");
            else if (age > 58 && age <= 100)
                System.out.println("the percentage of interest is 9.2%");
        } else {
            if (age >= 1 && age <= 58)
                System.out.println("the percentage of interest is 8.4%");
            else if (age > 58 && age <= 100)
                System.out.println("the percentage of interest is 10.5%");
        }
    }
}
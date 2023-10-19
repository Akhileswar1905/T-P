/*Given a string, ,split the string into individual string tokens .
Then, print the number of tokens, followed by each token on a new line.

Explore split function before solving:
you need to generate the tokens based on the following characters only: (if any other character is present in string, they should be treated as normal characters.)
 '!', '?', ',', '.', '_', "'", or '@'.

Note: if there are any trailing or leading whitespaces, remove them.

Test case examples:
---------------------------
input=Hey there!What's up
output=                                                      
5                                                                               
Hey                                                                           
there                                                                             
What                                                                           
s                                                                            
up 

input=   caution!you are@ignoring_whitespaces    //observe the leading whitespaces, u need to remove them
output=
5
caution
you
are
ignoring
whitespaces


*/
// Start writing your code from here

import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringTokenizer st = new StringTokenizer(str, " !@?,._'");
        System.out.printf("Total Number of Tokens: %d\n", st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

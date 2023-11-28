/*
write a java program that implements stack collection and checks if one stack is subset of another stack.

input format:
----------------
enter the size of stack A and enter the number of Elements.
enter the size of stack B and enter the number of elements.

Test case example:
input=
5
2 1 5 6 7
3 
1 5 6
output=
Is stack A subset of Stack B?: false
Is stack B subset of Stack A?: true

--------------
*/
//write your code below

import java.util.*;

public class Solution_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            a.push(x);
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b.push(x);
        }

        // int a = n>m?n:m;
        // int b = n<m?n:m;
        // int c = 0;

        // for(int i=0;i<a;i++){
        // int d = s1.pop();
        // if(d == s2.pop()){
        // c++;
        // d =
        // }
        // else c=0;
        // }
        // if(c == b) System.out.println("Yes");
        // else System.out.println("No");
        System.out.println("Is stack A subset of Stack B?: " + isSubStack(a, b));
        System.out.println("Is stack B subset of Stack A?: " + isSubStack(b, a));

    }

    public static boolean isSubStack(Stack<Integer> a, Stack<Integer> b) {
        HashSet<Integer> set = new HashSet<>(b);
        for (int i : a) {
            if (!set.contains(i))
                return false;
        }

        return true;
    }
}
/*write a java program delete middile element of linked list. 

test case example:
--------------------
input=5
2 1 3 5 7
output=
Original Linked List:
[2, 1, 3, 5, 7]
Linked List after deletion of middle:
[2, 1, 5, 7]
*/
//write your program from next line

import java.util.*;

public class Solution_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
            if (n == 1 || i != n / 2)
                list1.add(x);
        }

        System.out.println("Original Linked List:\n" + list.toString());
        System.out.println("Linked List after deletion of middle:\n" + list1.toString());

    }
}
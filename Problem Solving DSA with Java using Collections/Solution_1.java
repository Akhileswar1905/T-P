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

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a = str.split("\\s");
        List<Integer> list = new ArrayList<>();
        int sb = 1, b = 0, s = 0, sum = 0;

        if (a.length < 2) {
            System.out.println("At least two distinct numbers are required.");
            return;
        }

        for (int i = 0; i < a.length; i++) {
            list.add(Integer.parseInt(a[i]));
            s += list.get(i);
        }

        for (int i = 1; i < a.length; i++) {
            if (list.get(b) < list.get(i)) {
                sum += list.get(b);
                // System.out.println(i+" "+list.get(i)+" "+sum);
                sb = b;
                b = i;
            } else if (list.get(sb) < list.get(i)) {
                sum -= list.get(sb);
                sb = i;
            }
        }

        System.out.print("Sum between the largest and second-largest numbers: ");

        // if(sb-b == -1 || b-sb == -1 || list.get(b)==sum){
        // System.out.println(0);
        // }else if(sb>b){
        // System.out.println(s-list.get(b)-list.get(sb));
        // }else{
        // System.out.println((s-sum - list.get(b)));
        // }
        sum = 0;
        int x = b > sb ? b : sb;
        int y = b < sb ? b : sb;
        // System.out.println(x+" "+y);
        for (int i = y + 1; i < x; i++) {
            // System.out.println(list.get(i));
            sum += list.get(i);
        }

        System.out.println(sum);

    }
}
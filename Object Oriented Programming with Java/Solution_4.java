/* Given an existing class Mobile.java. U need to create an association between Mobile.java
and Person.java programs.

Mobile.java is given below:
-----------------------------
class Mobile {
    private String no;

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }
}

U need to create a list of mobile numbers in Person.java along with person name and implement
appropriate getter and setter methods to add mobilenumbers and display them.

Input format: Read the person name and enter only 2 mobile numbers each on separate line.
output format is as given in the following test cases:

Note: Don't rewrite the Mobile.java Class, its already given in Server.

Test case examples:
----------------------
Arun kumar
8665565569
7021378904
output=
Arun kumar has following mobile numbers:
8665565569
7021378904


*/
// Start writing your code from here

import java.util.*;

class Person {
    private String name;
    List<Mobile> list = new ArrayList<>();

    // Getter methods
    public String getName() {
        return name;
    }

    public String getNumbers() {
        String s = "";
        for (Mobile m : list) {
            s += m.getNo();
            s += "\n";
        }
        return s;
    }

    // Constructor
    Person(String name, String n1, String n2) {
        this.name = name;
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.setNo(n1);
        m2.setNo(n2);
        list.add(m1);
        list.add(m2);
    }
}

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        Person person = new Person(str, num1, num2);
        System.out.println(person.getName() + " has following mobile numbers:");
        System.out.println(person.getNumbers());
    }
}
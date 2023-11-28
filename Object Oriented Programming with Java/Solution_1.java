/*
The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int. 
Write the following methods (instance methods):

*Method named getFirstName without any parameters, it needs to return the value of the firstName field.
*Method named getLastName without any parameters, it needs to return the value of the lastName field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
    *In case both firstName and lastName fields are empty, Strings return an empty String.
    *In case lastName is an empty String, return firstName.
    *In case firstName is an empty String, return lastName.
    
To check if s String is empty, use the method isEmpty from the String class. 
For example, firstName.isEmpty() returns true if the String is empty 
Test case examples:
----------------------
input=abhishek reddy 56
output=
Full Name: abhishek reddy
Age: 56
Is Teen: false

case=t5
input=
ARUN

32
output=
Full Name: ARUN
Age: 32
Is Teen: false


case=t6
input=


45
output=
Full Name: Name Data missing
Age: 45
Is Teen: false


*/
// Start writing your code from here

import java.util.*;

class Human {

    private String fName, lName;
    private int age;

    // Getter Methods
    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getFullName() {
        if (fName.isEmpty() && lName.isEmpty())
            return "Name Data missing";
        return fName + " " + lName;
    }

    public int getAge() {
        return age;
    }

    // Setter Methods
    public void setFirstName(String str) {
        fName = str;
    }

    public void setLastName(String str) {
        lName = str;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Misc
    public boolean isTeen() {
        return age < 20 && age > 12;
    }

    // Constructor
    Human(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
}

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();
        String lName = sc.nextLine();
        int age = sc.nextInt();

        Human human1 = new Human(fName, lName, age);
        System.out.println("Full Name :" + human1.getFullName());
        System.out.println("Age :" + human1.getAge());
        System.out.println("Is Teen :" + human1.isTeen());

    }
}

/*
Given the following class Address, Create a Person class with the member name and
Address object. Initialize the Address members and name of person through constructor of Person.
Include Appropriate getter method to access name of person, and print person name including address details.

From the Solution class, read the details and print the result.

Input format: read name of the person, city, state and zipcode from the user.
output as per the test cases given.

//Hint: Create an Object of the Address class and initialize the data members.
        Create an object of the Person class and initialize the name and Link address object to Person class.

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String city, String state, String zipCode) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}

Note:  Don't rewrite the Address.java Class, its already given in Server.

Sample test case:
-----------------
input=rakesh reddy
bangalore
karnataka
560078
output=
Person Details:
Name: rakesh reddy
Address: bangalore, karnataka - 560078

*/
// Start writing your code from here

import java.util.*;

class Person {
    private String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
}

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String city = sc.nextLine();
        String state = sc.nextLine();
        String pinCode = sc.nextLine();

        Person person = new Person(name);
        Address address = new Address(city, state, pinCode);
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + address.getCity() + ", " + address.getState() + " - " + address.getZipCode());
    }
}

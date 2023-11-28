/*Given the Class Named Author with the following information:
Member variables : name,email and gender
Parameterized Constructor is used to initialize the data members.

The Class Template is given below:
----------------------------------
class Author 
{
    private String name, email;
    private char gender;
    
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
    }
}
Note: Explore toString() method to display the output:
------------------------------------------------------
using toString() method of the Object class, we can return values of the object without writing the explicit display method.


Using the above Class Author, Create a class Book with the following information.
Member variables : name (String), author (of the class Author), price (double)
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables.


Input Format:
-----------------
You need to enter the input in the following order:
Name of the Author
Email Id
Gender
Book Name
Price

Note:
-------------
No need to Write Author class. Its already given in the server.
You only need to implement the Book class. Read data and Access details of Author class and 
Print the Information as Given in test cases.

Test Case Example:
---------------------

input=Herbert Schildt
Herb@HerbSchildt.com
Male
Java the complete reference 
899.56
output=
Book Name: Java the complete reference
Author: [Name: Herbert Schildt, Email: Herb@HerbSchildt.com, Gender: M]
Price: 899.56


*/
// Start writing your code from here

import java.util.*;

class Book {

    // // Constructor
    // Book(String name, Authior author, double price){
    // this.name = name;
    // this.author = author;
    // this.price = price;
    // }

    // // Getter Methods
    // public String getName(){
    // return name;
    // }

    // public Author getAuthor(){
    // return author;
    // }

    // public double getPrice(){
    // return price;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String authorName = sc.nextLine();
        String email = sc.nextLine();
        String gender = sc.nextLine();
        String bookName = sc.nextLine();
        double price = sc.nextDouble();

        Author author = new Author(authorName, email, gender.charAt(0));

        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author.toString());
        System.out.println("Price: " + price);

    }

}

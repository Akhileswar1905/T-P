/*
Consider a university system where students can enroll in multiple courses, and each course can have multiple students enrolled. 
->Create a Java program that models this relationship using classes for Student and Course to manage the
relationship between students and courses.


Use the following menu driven operations and also instructions given for entering the input:
----------------------------------------------------------------------------------------------
1. enter student details (roll number and name)
2. Create course ( course id and course name)
3. Add student to course (enter student name followed by course name in next line)
4. Display students enrolled in each course.
5. Display Courses enrolled by each student.
6. Exit


Test case examples:
----------------------
input=
1
101 rajesh
1
102
omkar
1
103 sishir
1
104 pujitha
1
105 sreya

2
41 java
2
42 python

4
5

3
rajesh
java
3
rajesh
python
3
omkar
python
3
pujitha
java
3
sishir
python
4
5
6
output=
Student Added
Student Added
Student Added
Student Added
Student Added
Course Added
Course Added

Students enrolled in java course:
No students enrolled in this course.
Students enrolled in python course:
No students enrolled in this course.

Courses enrolled by rajesh:
No courses enrolled by this student.

Courses enrolled by omkar:
No courses enrolled by this student.

Courses enrolled by sishir:
No courses enrolled by this student.

Courses enrolled by pujitha:
No courses enrolled by this student.

Courses enrolled by sreya:
No courses enrolled by this student.

rajesh has been enrolled to java course.
rajesh has been enrolled to python course.
omkar has been enrolled to python course.
pujitha has been enrolled to java course.
sishir has been enrolled to python course.

Students enrolled in java course:
rajesh
pujitha
Students enrolled in python course:
rajesh
omkar
sishir

Courses enrolled by rajesh:
java
python

Courses enrolled by omkar:
python

Courses enrolled by sishir:
python

Courses enrolled by pujitha:
java

Courses enrolled by sreya:
No courses enrolled by this student.

test case example 2:
-----------------------------
input=1
101 rajesh
2
41 java
3
rajesh
python
4
5
6
output=
Student Added
Course Added
Invalid data entered. Student or course not found.

Students enrolled in java course:
No students enrolled in this course.

Courses enrolled by rajesh:
No courses enrolled by this student.

*/
// Start writing your code from here

import java.util.*;

class Course {
    private String name;
    private int id;
    private List<Student> students = new ArrayList<>();

    // Constructor
    Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    private String name;
    private int roll;
    private List<Course> courses = new ArrayList<>();

    // Constructor
    Student(int roll, String name) {
        this.name = name;
        this.roll = roll;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Add course
    public void addCourse(Course c) {
        courses.add(c);
    }
}

public class Solution_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int rollNo = sc.nextInt();
                    // sc.nextLine();
                    String name = sc.next();
                    // System.out.println(name);
                    Student s = new Student(rollNo, name.trim());
                    students.add(s);
                    System.out.println("Student Added");
                    break;
                case 2:
                    int id = sc.nextInt();
                    // sc.nextLine();
                    name = sc.next();
                    Course c = new Course(id, name.trim());
                    courses.add(c);
                    System.out.println("Course Added");
                    break;
                case 3:
                    // if(students.size() == 0 || courses.size() == 0){
                    // System.out.println("Invalid data entered. Student or course not found\n");
                    // }
                    sc.nextLine();
                    name = sc.nextLine();
                    Student std = searchStudent(name, students);
                    // if(std != null){
                    String cour = sc.nextLine();
                    Course cou = searchCourse(cour, courses);
                    if (cou != null) {
                        std.addCourse(cou);
                        cou.addStudent(std);
                        System.out.println(std.getName() + " has been enrolled to " + cou.getName() + " course");
                    } else
                        System.out.println("Invalid data entered. Student or course not found\n");
                    // }else System.out.println("Student not found.");
                    break;
                case 4:
                    displayCourses(courses);
                    break;
                case 5:
                    displayStudents(students);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static Student searchStudent(String name, List<Student> students) {
        for (Student s : students) {
            if (name.equalsIgnoreCase(s.getName().trim())) {
                return s;
            }
        }
        return null;
    }

    public static Course searchCourse(String name, List<Course> courses) {
        for (Course c : courses) {
            if (name.equalsIgnoreCase(c.getName().trim())) {
                return c;
            }
        }
        return null;
    }

    public static void displayStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println("Courses enrolled by " + s.getName() + ": ");
            if (s.getCourses().size() == 0)
                System.out.println("No courses enrolled by this student.\n");
            else {
                for (Course c : s.getCourses()) {
                    System.out.println(c.getName());
                }
            }
        }
    }

    public static void displayCourses(List<Course> courses) {
        for (Course c : courses) {
            System.out.println("Students enrolled in " + c.getName() + " course:");
            if (c.getStudents().size() == 0)
                System.out.println("No students enrolled in this course.\n");
            else {
                for (Student s : c.getStudents()) {
                    System.out.println(s.getName());
                }
            }
        }

    }
}
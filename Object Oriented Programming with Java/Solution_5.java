/*
Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy
before going to work. Bob might also have some extra buckets at home.
He also knows the area that he can cover with one bucket of paint.

You need to implement the 3 methods based on the information available with the Bob as mentioned below:

1. Write a method named getBucketCount with 4 parameters.
----------------------------------------------------------------
    The first parameter should be named width of type double. This parameter represents the width of the wall.
    The second parameter should be named height of type double. This parameter represents the height of the wall.
    The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
    The fourth parameter should be named extraBuckets. This parameter represents the extra bucket count that Bob has at home.

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. 

If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1
to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

Explaination:
-----------------------
getBucketCount(3.4, 2.1, 1.5, 2) →   wall width 3.4, wall height 2.1, a single bucket can cover an area of 1.5 and 
                                     Bob has 2 extra buckets at home.
                                    
                                    Understand the calculations below:
                                    -----------------------------------
                                     double totalArea = 3.4 * 2.1 = 7.14
                                     double areaWecanPaint = areaPerBucket * extraBuckets =1.5 * 2 = 3
                                     double areatobePainted = totalArea - areaWecanPaint = 7.14 - 3 = 4.14 
                                      
                                     int neededBuckets = areatobePainted / areaPerBucket = 4.14 / 1.5 = 2.76 = 3 (round it off to next digit)  
                                     Hence the method will return 3 as the number of buckets that bob still need to buy to cover totalArea!!
                                     
getBucketCount(-3.4, 2.1, 1.5, 2) →  should return -1 since the width parameter is invalid


2. In second case, Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
   Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).
   This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work.


getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
                                 Understand the calculations Below:
                                 ----------------------------------
                                  double totalArea = width * height = 7.14;
                                  int neededBuckets = totalArea / AreaPerBucket = 7.14 / 1.5 = 4.76 = 5 (rounded off to next digit)
                                 

3. In third case, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work.

getBucketCount(7.14, 1.5); →   should return 5 since the wall area is 7.14 and a single bucket can cover an area of 1.5.
                               totalArea / areaPerBucket = 7.14 / 2.2 = 4.76 = 5 (rounded off to next digit)


Note: you can use Menu drive approach with switch case to implement above 3 methods based on user choice.

Test case examples:
----------------------

input=1                      //choice 1 getBucketCount with 4 parameters
3.42 2.1 1.5 2
2                           //choice 2 getBucketCount with 3 parameters
3.42 2.1 1.5
3                           //choice 3 getBucketCount with 2 parameters
40.85 5.5
4                           //exit case 
output=
Buckets needed: 3
Buckets needed: 5
Buckets needed: 8

case=t2
input=5
3
8.26 4
4
output=
Invalid Choice!
Buckets needed: 3


*/
// Start writing your code from here

import java.util.*;

public class Solution_5 {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        return (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) ? -1
                : (int) Math.ceil((width * height) / areaPerBucket) - extraBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return (width <= 0 || height <= 0 || areaPerBucket <= 0) ? -1
                : (int) Math.ceil((width * height) / areaPerBucket);

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return (area <= 0 || areaPerBucket <= 0) ? -1 : (int) Math.ceil((area) / areaPerBucket);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("1. Calculate buckets needed with extra buckets");
        // System.out.println("2. Calculate buckets needed without extra buckets");
        // System.out.println("3. Calculate buckets needed using area");

        double width, height, area, areaPerBucket;
        int extra;

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    width = sc.nextDouble();
                    height = sc.nextDouble();
                    areaPerBucket = sc.nextDouble();
                    extra = sc.nextInt();

                    System.out.println("Buckets needed: " + getBucketCount(width, height, areaPerBucket, extra));
                    break;
                case 2:
                    width = sc.nextDouble();
                    height = sc.nextDouble();
                    areaPerBucket = sc.nextDouble();
                    System.out.println("Buckets needed: " + getBucketCount(width, height, areaPerBucket));
                    break;

                case 3:
                    area = sc.nextDouble();
                    areaPerBucket = sc.nextDouble();
                    System.out.println("Buckets needed: " + getBucketCount(area, areaPerBucket));
                    break;
                case 4:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }

        }

    }
}

/*Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. 
The parameter bigCount represents the count of big flour bags (5 kilos each).
The parameter smallCount represents the count of small flour bags (1 kilo each).
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. 
The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount. 
For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, 
if goal = 9, bigCount = 1, and smallCount = 4, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, 
and it's okay if there are additional bags left over.

Note: If any of the parameters are negative, Print error message:"Input numbers can not be negative".

Explaination:
----------------
canPack (1, 0, 4): should return false since bigCount is 1 (5 kilos) and goal is 4 kilos.
canPack (1, 0, 5): should return true since bigCount is 1 (5 kilos) and goal is 5 kilos.
canPack (2, 8, 12): should return true since bigCount is 2 (10 kilos) and smallCount is 8 (small bags of 1 kilo) and goal is 12 kilos, 
and we have 1 bag left which is ok as mentioned above.
canPack (2, 2, 11): should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
canPack (-3, 2, 12): should return false since bigCount is negative.

Test Case Examples:
-----------------------
input=2 0 9
output=Its not possible to make a package

input=1 5 9
output=Its Possible to make a package of 2 bags w.r.t Goal Kilos

input=-3 2 12
output=Input numbers can not be negative


*/
// Start writing your code from here

import java.util.*;

public class Solution_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int bigCount = sc.nextInt();
            int smallCount = sc.nextInt();
            int goal = sc.nextInt();
            sc.close();
            if(bigCount<0||smallCount<0||goal<0){
                throw new IllegalArgumentException("Input numbers can not be negative");
            }
            if(canPack(bigCount,smallCount,goal)){
                System.out.println("Its Possible to make a package of 2 bags w.r.t Goal Kilos");
            }else{
                System.out.println("Its not possible to make a package");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean canPack(int a,int b,int c){
        int bigBags = c/5;
        if(a<bigBags){
            bigBags = a;
        }
        return (bigBags*5+b >=c);
    }
}
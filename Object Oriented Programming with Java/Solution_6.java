/* Given an existing Account Class, you need to implement the concept of method overriding,
by accessing the method calculateInterest() from Account class to SavingsAccount Class
and also to FixedDepositAccount class.

and then calculate the Interest rates form both accounts based on following conditions:
For Savings Bank account 7% interest on the account balance.
For Fixed Deposit account 9% interest on the account balance.

U need to initialize the main balance in the Account class, through constructors of SavingsAccount and FixedDepositAccount classes.

Input format: Read the Savings Account balance in first line.
              Read the Fixed deposit Account balance in second line.
Output format: Calculate interest for the respective accounts and print the interest amount by restricting it to 2 decimal places.

Note: Account Class is already given in the server. So students need not to rewrite it again

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void calculateInterest() {
        System.out.println("Interest calculation depends on Accounts."); 
    }
}

Test Case Example:
----------------------
input=10000
50000
output=
Interest for a savings account: Rs. 700.00
Interest for a fixed deposit account: Rs. 4500.00

*/
// Start writing your code from here

import java.util.*;

class SavingsAccount extends Account {
    private double bal;

    // Constructor
    SavingsAccount(double bal) {
        super(bal);
        this.bal = bal;
    }

    public void calculateInterest() {
        System.out.printf("Interest for a savings account : Rs. %.2f\n", bal * (0.07));
    }
}

class FixedDepositAccount extends Account {
    private double bal;

    // Constructor
    FixedDepositAccount(double bal) {
        super(bal);
        this.bal = bal;
    }

    public void calculateInterest() {
        System.out.printf("Interest for a fixed deposit account : Rs. %.2f", bal * (0.09));
    }
}

public class Solution_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sab = sc.nextDouble();
        double fab = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(sab);
        FixedDepositAccount fa = new FixedDepositAccount(fab);
        sa.calculateInterest();
        fa.calculateInterest();
    }
}
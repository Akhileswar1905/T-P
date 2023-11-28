/* Given the following BHIMUPI.java class:
---------------------------------------------
class BHIMAPI {
    protected static final String GPAY_PIN = "1717";
    protected static final String PHONEPE_PIN = "2727";
    protected static final String PAYTM_PIN = "3737";

    private static boolean verifyPin(String userPin, String actualPin) {
        return userPin.equals(actualPin);
    }

    final boolean BhimAccess(String userPin, String actualPin) {
        if (verifyPin(userPin, actualPin))
        {
            System.out.println("BHIM UPI Access Granted.");
            return true; 
        }
        else 
        {
            System.out.println("Transaction is Aborted.");
            return false;
        }
    }
}

You need to create a menu drive program to perform valid payment transactions.
Create 3 separate classes for GPay, Phonepe and Paytm which extends the BHIMAPI class.
and access the individual UPI_PIN provided in that class.

There is a final method named as BhimAccess() which will access the PIN entered by the user
and actual PIn for the corresponding Payment app. It will return true and grant access to UPI
only if the PINs Matches else it will return Transaction is Aborted.

In each classes of GPay, Phonepe and Paytm, they should hav their individual functions
which calls the BhimAcess() method with 2 parameters, entered Pin and actual Pin.
only if the BhimAccess() returns true, you need to print the message:

Gpay transaction is successul.
Phonepe transaction is successful.
Paytm transaction is successful.

otherwise Print "Invalid Gpay Pin"
                "Invalid Phonepe Pin"
                "Invalid Paytm Pin"

input format: 
----------------
                System.out.println("1. GPay");
                System.out.println("2. PhonePe");
                System.out.println("3. Paytm");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

enter the choice of payment app and on same line enter the Upi Pin(in String format).
Note: user has to give the existing UPI_PIN details only in the given class BHIMAPI.java for valid transaction.

for the Output format and other possible scenarios, observe the 
given test cases below.


Test Case examples:
----------------------
input=
1 1717
output=
BHIM UPI Access Granted
GPay transaction is successful.

input=
1 2727
output=
Transaction is Aborted
Invalid GPay Pin

input=
2 2727
output=
BHIM UPI Access Granted
PhonePe transaction is successful.

input=3 
3737
1
1717
2
2727
output=
BHIM UPI Access Granted.
Paytm transaction is successful.
BHIM UPI Access Granted.
GPay transaction is successful.
BHIM UPI Access Granted.
Phonepe transaction is successful.

input=
5 
output=
Invalid Payment Option.

*/
// Start writing your code from here

import java.util.*;

class GPay extends BHIMAPI {
    void met(String pin) {
        if (BhimAccess(pin, GPAY_PIN)) {
            System.out.println("GPay transaction is successful.");
        } else {
            System.out.println("Invalid GPay Pin");
        }
    }
}

class Phonepe extends BHIMAPI {
    void met(String pin) {
        if (BhimAccess(pin, PHONEPE_PIN)) {
            System.out.println("Phonepe transaction is successful.");
        } else {
            System.out.println("Invalid Phonepe Pin");
        }
    }
}

class Paytm extends BHIMAPI {
    void met(String pin) {
        if (BhimAccess(pin, PAYTM_PIN)) {
            System.out.println("Paytm transaction is successful.");
        } else {
            System.out.println("Invalid Paytm Pin");
        }
    }
}

public class Solution_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        String pin;

        while (true) {
            ch = sc.nextInt();
            // sc.nextLine(/);
            switch (ch) {
                case 1:
                    pin = sc.next();
                    new GPay().met(pin);
                    break;
                case 2:
                    pin = sc.next();
                    new Phonepe().met(pin);
                    break;
                case 3:
                    pin = sc.next();
                    new Paytm().met(pin);
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Payment Option.");

            }
        }
    }
}

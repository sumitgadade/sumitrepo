/*Define a class SavingAccount (acno, name, balance). Define appropriate
constructors and operations withdraw(), deposit(), and viewbalance(). The
minimum balance must be 500. Create an object and perform operations. Raise user
defined “InsufficientFundsException” when balance is not sufficient for withdraw
operation.*/

import java.util.*;

class insufficientFundException extends Exception {
    insufficientFundException() {
        System.out.println("\nTransaction failed due to insufficient fund in account\n");
    }
}

class savingAccount {
    int accno;
    String name;
    float balance;

    savingAccount(int accno, String name, float bal) {
        this.accno = accno;
        this.balance = bal;
        this.name = name;
    }

    boolean withdraw(float amount) {
        try {
            if ((this.balance) > amount) {
                this.balance -= amount;
                return true;
            } else {
                throw new insufficientFundException();
            }
        } catch (insufficientFundException e) {
        }
        return false;
    }

    boolean deposite(float amount) {
        this.balance += amount;
        return true;
    }

    static int menu() {
        System.out.println("********MENU********");
        System.out.println("1] Withdraw");
        System.out.println("2] Deposit");
        System.out.println("3] View Balance");
        System.out.println("4] Exit");
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a choice");
        int choice = scan.nextInt();
        scan.close();
        return choice;
    }

    public static void main(String args[]) {
        int choice;
        float amt;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scan.next();

        savingAccount obj = new savingAccount(1, name, 500);

        while ((choice = menu()) != 4) {
            switch (choice) {
                case 1:
                    System.out.print("Enter amount : ");
                    amt = scan.nextFloat();
                    if (obj.withdraw(amt)) {
                        System.out.println("Transaction Complete!!");
                        System.out.println("Available balance: " + obj.balance + "\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter a amount: ");
                    amt = scan.nextFloat();
                    if (obj.deposite(amt)) {
                        System.out.println("Transaction Complete!!");
                        System.out.println("Available balance: " + obj.balance + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Balance = " + obj.balance + "\n");
                    break;

                case 4:
                    scan.close();
                    break;
            }
        }
    }
}

import java.io.*;
import java.util.*;

interface CreditCardInterface {
    abstract void viewCreditAmount();

    abstract void useCard(int n);

    abstract void payCredit(int n);

    abstract void increaseLimit(int m);
}

class SilverCC implements CreditCardInterface {
    String name;
    String no;

    int Cno;
    int creditAmt = 0;
    int cLimit;

    SilverCC(int l) {
        cLimit = l;
    }

    void set(String n, String name) {
        if (n.length() == 16) {
            this.no = n;
            this.name = name;
        } else {
            System.out.println("Wrong Number");
            System.exit(0);
        }
    }

    void show() {
        System.out.println("Name is " + this.name);
        System.out.println("No is " + this.no);
        viewCreditAmount();
        }

    public void viewCreditAmount() {
        System.out.println("Credit Amount is " + this.creditAmt);
    }

    public void useCard(int add) {
        creditAmt += add;
        if (creditAmt > cLimit) {
            System.out.println("Cant be added... More than limit");
            creditAmt -= add;
        } else
            viewCreditAmount();
    }

    public void payCredit(int add) {
        if (add > creditAmt)
            System.out.println("no enough credit");
        else {
            creditAmt -= add;
            if (creditAmt < 0)
                creditAmt = 0;
            viewCreditAmount();
        }
    }

    public void increaseLimit(int m) {
    }
}

class GoldCC extends SilverCC {
    static int n;

    GoldCC(int l) {
        super(l);
    }

    void set(String n, String name1) {
        super.set(n, name1);
    }

    void show() {
        super.show();
    }

    public void viewCreditAmount() {
        super.viewCreditAmount();
    }

    public void useCard(int add) {
        super.useCard(add);
    }

    public void increaseLimit(int amt) {
        while (n < 3) {
            if (amt < 5000) {
                this.cLimit = this.cLimit + amt;
                System.out.println("new credit limit is:" + cLimit);
            } else
                System.out.println("Cant be more than 5000");
            n++;
        }
    }
}

class interfaceDemo {
    public static void main(String a[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of objects ");
        int r = scan.nextInt();
        SilverCC[] g = new SilverCC[r];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter type of card (S or G)");
            String ch = scan.next();

            switch (ch) {
                case "S":
                    g[i] = new SilverCC(50000);
                    System.out.println("Enter name :");
                    String name = scan.next();
                    System.out.println("Enter no :");
                    String n = scan.next();
                    g[i].set(n, name);
                    g[i].viewCreditAmount();
                    System.out.println("Enter amount to add");
                    int n1 = scan.nextInt();
                    g[i].useCard(n1);
                    System.out.println("Enter amount to remove");
                    int n2 = scan.nextInt();
                    g[i].payCredit(n2);
                    g[i].show();
                    break;

                case "G":
                    g[i] = new GoldCC(100000);
                    System.out.println("Enter name :");
                    name = scan.next();
                    System.out.println("Enter no :");
                    n = scan.next();
                    g[i].set(n, name);
                    g[i].viewCreditAmount();
                    System.out.println("Enter amount to add");
                    int n3 = scan.nextInt();
                    g[i].useCard(n3);
                    System.out.println("Enter amount to remove");
                    int n4 = scan.nextInt();
                    g[i].payCredit(n4);
                    System.out.println("Enter amount to increase credit Limit :");
                    int n5 = scan.nextInt();
                    g[i].increaseLimit(n5);
                    g[i].show();
                    break;
            }
        }
        scan.close();
    }
}
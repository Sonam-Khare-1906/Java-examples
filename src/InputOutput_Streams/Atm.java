//Deposit Money
//Withdraw Money
//Transfer Money
//Check Account Balance


package InputOutput_Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface automated{
    abstract void atm(double amount);
}

public class Atm implements automated {
    double balance;

    public void atm(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money Deposit Successfully" + " " + balance + "Rs/-");
        } else {
            System.out.println("Invalid Money");
        }
    }

    public void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdraw Successfully Remaining Balance" + " " + balance + "Rs/-");
        } else {
            System.out.println("Invalid amount of Money");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User Name:");
        String name=sc.nextLine();
        System.out.println("Welcome,"+" "+name);
        automated a = new Atm();
        a.atm(1000);
        int value;
        double amount;
        List<Double> deposits=new ArrayList<>();
        List<Double> withdraws=new ArrayList<>();
        do {
            System.out.println("---------------------------------------");
            System.out.println("ATM Options:-");
            System.out.println("1.Check Account Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exist");
            System.out.println("Choose any one of the Option");
            System.out.println("---------------------------------------");
            value = sc.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Your Balance Amount is" + "-" +((Atm) a).getBalance() + "Rs/-");
                    break;
                case 2:
                    System.out.println("Deposit the Amount");
                    amount = sc.nextInt();
                    ((Atm) a).Deposit(amount);
                    deposits.add(amount);
                    break;
                case 3:
                    System.out.println("Withdraw the Amount");
                    amount = sc.nextInt();
                    ((Atm) a).Withdraw(amount);
                    withdraws.add(amount);
                    break;
                case 4:
                    System.out.println("Thank You for Using this Atm");
                    break;
                default:
                    System.out.println("Invalid Choice,Please enter valid Option");
            }
        }
        while (value != 4);
        sc.close();
        System.out.println("---------------------------------------");
        System.out.println("User Description"+"-"+name);
        System.out.println("Deposit the Amount"+"-"+deposits);
        System.out.println("Withdraw the Amount"+"-"+withdraws);
        System.out.println("Your Final Balance Amount"+"-"+((Atm)a).getBalance());
        System.out.println("Thank You for Visiting this Atm,Visit Again!!!");
        System.out.println("---------------------------------------");
    }
}


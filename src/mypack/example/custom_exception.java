//Custom Exception:-write a program that throws exception if a bank balance drops below 1000 due to any transaction.
package mypack.example;
import java.util.Scanner;
public class custom_exception {
    public static void main(String[] args) {
        bankException b = new bankException();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the deposit money:");
        int deposit= sc.nextInt();
               try{
                   b.setBalance(deposit);
               }
               catch (bankbalance e)
               {
                   System.out.println("Exception:"+e.getMessage());
               }
    }
}
class bankbalance extends Exception{
    public bankbalance(String s)
    {
        super(s);
    }
}
class bankException {
    int fixedAmt=5000;
    public void setBalance(double balance) throws bankbalance
    {
        double Checkbalance=fixedAmt-balance;
        if (Checkbalance < 1000) {
            throw new bankbalance("Transaction failed: Balance drops below 1000rs");
        } else {
            System.out.println("Transaction successful. Balance: " + balance);
        }
    }
}

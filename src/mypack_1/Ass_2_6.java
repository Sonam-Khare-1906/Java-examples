//6.	A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

package mypack_1;

import java.util.Scanner;

public class Ass_2_6 {
    public Ass_2_6(){

    }
    public static void main(String[] args) {
        Ass_2_6 obj=new Ass_2_6();
        obj.cost();
    }
        public void cost () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the price of quantity:");
            int a = sc.nextInt();
            int quantity = 1000;
            if (a > quantity) {
                double discount = 0.1 * a;
                double price = (a - discount);
                System.out.println("The cost of purchased quantity:" + price);
            } else {
                System.out.println("The cost of purchased quantity:" + a);
            }
        }
    }
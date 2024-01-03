//1)Write a program to enter the numbers till the user wants and at the end
// it should display the count of positive, negative and zeros entered.

import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number till 100");
        int a = sc.nextInt();
        while (a < 100) {
            if (a > 0) {
                System.out.println("Positive Number:" + a);
            } else {

                System.out.println("Negative Number");
            }
            a++;
        }
    }
}

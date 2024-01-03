//11.	Define a method to calculate power of a number raised to other i.e.
// ab using recursion where the numbers 'a' and 'b' are to be entered by the user
package mypack_1;

import java.util.Scanner;

public class Ass_2_11 {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a = sc.nextInt();
        System.out.println("Enter the b value:");
        int b = sc.nextInt();
        int power = (int) Math.pow(a, b);
        System.out.println("The  Power of the a and b values:" + power);

    }

}



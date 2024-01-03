//1.	Write a program to print the power of 7 raised to 5.

package mypack_1;

import java.util.Scanner;

public class Ass_2_1 {
    public Ass_2_1(){

    }
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

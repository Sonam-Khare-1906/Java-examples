//) In this challenge, we test your knowledge of using
// if-else conditional statements to automate decision-making processes.
// An if-else statement has the following logical flow:
//Given an integer, , perform the following conditional actions:
//        •	If  is odd, print Weird
//        •	If  is even and in the inclusive range of  to , print Not Weird
//        •	If  is even and in the inclusive range of  to , print Weird
//        •	If  is even and greater than , print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a % 2==0 && a > 20) {
            System.out.println("Even Number is inclusive range not  Weird");
        }
        else {
            if(a%2==0 && a>=20){
                System.out.println("Even Number is inclusive range not  Weird");
            
            }
             else if (a % 2 == 0 && a < 20) {
                System.out.println("Even Number is Weird");
            }
              else {
                System.out.println("Number is Odd Weird");
            }
        }
    }
}

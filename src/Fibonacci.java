//6) Java Program to Display Fibonacci Series
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int firstTerm=0,secondTerm=1;
        for (int i = 0; i <= a; i++){
            int temp = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = temp;
            System.out.println("Fibonacci Series:" + temp);
        }
    }
}
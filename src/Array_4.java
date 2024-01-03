//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
// For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;
public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int remainder = 0;
        while (a != 0) {
            remainder = 0;
            int reverse = a % 10;
            remainder = remainder * 10 + reverse;
            a /= 10;
            System.out.println("Reverse the number" + remainder);
        }
    }
}
//11.Java Program to reverse a string and palindrome string
import java.util.Scanner;
public class String_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
            if (str.equalsIgnoreCase(reversed.toString())) {
                System.out.println("Reversed String is Palindrome");
            } else {
                System.out.println("Reversed String is not a Palindrome");
            }
        }

    }


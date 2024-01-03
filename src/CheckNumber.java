import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a= sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter any Digit");
        int b= sc1.nextInt();
        if(a==b){
            System.out.println("Enter number is equal");
        }
        else if(a>=b){
            System.out.println("Enter number is Greater than the first number");
        }
        else {
            System.out.println("Enter number is less than the first number");
        }
    }
}

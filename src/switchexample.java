import java.util.Scanner;

public class switchexample {
    public static void main(String[] args){
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
         System.out.println("Enter 1st No.:");
         int x=sc.nextInt();
        System.out.println("Enter 2nd No.:");
        int y=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition of 2 no:"+"-"+x+y);
           break;
            case 2:
                System.out.println("Subtraction of 2 no:"+"-"+(x-y));
            break;
                case 3:
                System.out.println("Multiplication of 2 no:"+"-"+x*y);
           break;
            case 4:
                System.out.println("Division of 2 no:"+"-"+x/y);
            break;
                default:
                    System.out.println("Entered wrong number");
        }
    }
}

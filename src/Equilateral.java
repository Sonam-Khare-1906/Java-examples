import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sa1=new Scanner(System.in);
        Scanner sb1=new Scanner(System.in);
        System.out.println("Enter the value of a side  a:");
        int a1=sc1.nextInt();
        System.out.println("Enter the value of a side  b:");
        int b1=sa1.nextInt();
        System.out.println("Enter the value of a side c:");
        int c1=sb1.nextInt();
        if(a1 == b1 && b1 == c1)
        {
            System.out.println("The triangle is Equilateral");
        }
        else if(a1 == b1 || b1 == c1 || c1 == a1)
        {
            System.out.println("The triangle is Isosceles triangle");
        }
        else{
            System.out.println("The triangle is not a equilateral or Isosceles");
        }
    }
}

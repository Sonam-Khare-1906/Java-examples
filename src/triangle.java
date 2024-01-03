import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sa.nextInt();
        System.out.println("Enter the value of c:");
        int c = sb.nextInt();
        if (a+b+c==180)  //Sum of the two sides are greater than the third side
        {
            System.out.println("The values of a triangle is valid");
        } else {
            System.out.println("The values of a triangle is not valid");
        }
    }
}

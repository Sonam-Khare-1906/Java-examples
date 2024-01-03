//1) Java Program to Find all Roots of a Quadratic Equation
import java.util.Scanner;
public class QuadraticEqu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a value:");
        double a=sc.nextDouble();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the b value");
        double b=sc1.nextDouble();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the c value");
        double c=sc2.nextDouble();
        double x=1;
        double root1=0;
        double root2=0;
        double v = (a * Math.sqrt(x) + b * (x) + c);
//        System.out.println("Quadratic Equation:"+ v);
        if(v >0) {
            double i=(b*b-4*a*c);
           root1 = ((-b + Math.sqrt(i)) / (2 * a));
           root2= ((-b - Math.sqrt(i))/(2 * a));
            System.out.println("Quadratic Equation:"+ root1);
            System.out.println("Quadratic Equation:"+ root2);
        }
        else if(v==0){
                System.out.println("Quadratic Equation Values are not equal to Zero");
            }
            else{
                System.out.println("Quadratic Equation is not real values");
            }
    }
}



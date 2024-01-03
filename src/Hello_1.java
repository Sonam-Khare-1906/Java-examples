
import java.util.Scanner;

public class Hello_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Department Name");
             String str= sc.next();
        Scanner sc1=new Scanner(System.in);
           System.out.println("Enter the Year");
           int a=sc1.nextInt();
           if(str.equals("ComputerScience")){
               if(a==1){
                   System.out.println("Computer Science Department with 1st Year");
               }
               if(a==2){
                   System.out.println("Computer Science Department with 2nd Year");
               }
               if(a==3){
                   System.out.println("Computer Science Department with 3rd Year");
               }
               if(a==4){
                   System.out.println("Computer Science Department with 4th Year");
               }
           }
        if(str.equals("Mathematics")){
            if(a==1){
                System.out.println("Mathematics Department with 1st Year");
            }
            if(a==2){
                System.out.println("Maths Department with 2nd Year");
            }
            if(a==3){
                System.out.println("Maths Department with 3rd Year");
            }
            if(a==4){
                System.out.println("Maths Department with 4th Year");
            }
        }
        else {
                System.out.println("Conditions are not Satisfy");
            }
        }
        }




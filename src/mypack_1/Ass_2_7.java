//7.	A school has following rules for grading system:
//        a. Below 25 - F
//        b. 25 to 45 - E
//        c. 45 to 50 - D
//        d. 50 to 60 - C
//        e. 60 to 80 - B
//        f. Above 80 - A
//        Ask user to enter marks and print the corresponding grade.

package mypack_1;

import java.util.Scanner;

public class Ass_2_7 {
    public static void main(String[] args) {
        Ass_2_7 obj=new Ass_2_7();
        obj.grades();
    }
    public Ass_2_7(){ //Constructor
    }
    public void grades(){     //Function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int a=sc.nextInt();
        System.out.println("Enter the marks:");
        int b=sc.nextInt();
        System.out.println("Enter the marks:");
        int c=sc.nextInt();
        System.out.println("Enter the marks:");
        int d=sc.nextInt();
        System.out.println("Enter the marks:");
        int e=sc.nextInt();
        int total=a+b+c+d+e;
        System.out.println("Total marks of the Subjects:"+total);
        int percentage=(total)/5;
        System.out.println("Total Percentage of the marks:"+percentage);
            if (percentage > 80) {
                System.out.println("A is the grade");
            } else if (60 >= 80) {
                System.out.println("B is the grade");

            } else if (50 <= 60) {
                System.out.println("C is the grade");

            } else if (45 >= 50) {
                System.out.println("D is the grade");

            } else if (25 >= 50) {
                System.out.println("E is the grade");

            } else {

                System.out.println("Fail");
            }
        }

    }



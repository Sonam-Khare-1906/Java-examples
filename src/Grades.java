import java.util.Scanner;
// A school has following rules for grading system:
//        a. Below 25 - F
//        b. 25 to 45 - E
//        c. 45 to 50 - D
//        d. 50 to 60 - C
//        e. 60 to 80 - B
//        f. Above 80 - A
//        Ask user to enter marks and print the corresponding grade.

public class Grades {
    public static void main(String[] args)
    {
//to calculate the percentage of a grade in a marks
        int Phy=85;
        int che=90;
        int mat=75;
        int Bio=87;
        int comp=92;
        int per=(Phy+che+mat+Bio+comp)/5;
        if(per <= 90)
        {
            System.out.println("A is a Grade");
        }
        else if(80>=per && per<90)
        {
            System.out.println("B is a Grade");
        }
        else if(70>=per && per<80)
        {
            System.out.println("C is a Grade");
        }
        else if(60>per && per<70)
        {
            System.out.println("D is a Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

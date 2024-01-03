//5.	If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        //write a program to calculate his total marks and percentage marks.
package mypack_1;

import java.util.Scanner;

public class Ass_2_5 {
    public static void main(String[] args){
        Ass_2_5 obj=new Ass_2_5();
        obj.Calculate();
    }
    int Maths;
    int English;
    int Hindi;
    public Ass_2_5(){

    }
    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks out of 100:");
        int a = sc.nextInt();
        System.out.println("Enter the Marks out of 100:");
        int b = sc.nextInt();
        System.out.println("Enter the Marks out of 100:");
        int c = sc.nextInt();
        int result =a + b + c ;
        System.out.println("Total Marks of the Robert:" + result);
        int percentage;
        percentage = (a + b + c ) / 3;
        System.out.println("Total Marks of the percentage:" + percentage);
    }
}

//14. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
// a class named 'Triangle' without any parameter in its constructor.

package mypack_1;

import java.util.Scanner;

public class Triangle {
 public static void main(String[] args){
     area();
     rectangle();
 }
    public static void area() { //function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value:");
        int base=sc.nextInt();
        System.out.println("Enter the Height value:");
        int height=sc.nextInt();
        double area_of_triangel=(base*height)/2;
        System.out.println("The area of a triangle:"+area_of_triangel);
    }
    public static void rectangle() { //function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value:");
        int breadth=sc.nextInt();
        System.out.println("Enter the Height value:");
        int length=sc.nextInt();
        float area_of_rectangle=(breadth*length);
        System.out.println("The area of a triangle:"+area_of_rectangle);
    }
}
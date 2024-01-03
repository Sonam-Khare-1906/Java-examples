//3.	Write a program to calculate the sum of the digits of a 3-digit number.
//Number : 132        Output : 6

package mypack_1;

import java.util.Scanner;

public class Ass_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Digit:");
        int a = sc.nextInt();
        int sum = 0;
       for( ;a>0;) {
           int result = a %10;
            sum+=result;
          a/=10;
       }
           System.out.println("Calculate the sum of the digits of a 3-digit number."+sum);
    }
//    int a;
//    public Ass_2_3(){
//
//    }
////        for(int i=0;i<a.length;i++)
////        {
////    }
//            public void calculate(int c){
//                c = a++;
//                int d = ++c;
//                int e=++d;
//            System.out.println("Calculate the sum of the digits of a 3-digit number:"+e);
//        }
//
}

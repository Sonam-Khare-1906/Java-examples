//4.	Write a program to find square of a number.
//        E.g.-
//        INPUT : 2        OUTPUT : 4
//        INPUT : 5        OUTPUT : 25

        package mypack_1;

import java.util.Scanner;

public class Ass_2_4 {
    public static void main(String[] args) {
        Ass_2_4 obj=new Ass_2_4();
        obj.square();
    }
        public Ass_2_4() {
        }
        
        public void square(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number:");
            int a = sc.nextInt();
            int result=(int)(Math.pow((a),2));
          System.out.println("Square of the number:"+result);
        }
    }


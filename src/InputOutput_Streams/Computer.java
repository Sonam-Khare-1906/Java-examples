package InputOutput_Streams;

import java.util.Scanner;

class Music extends  Thread{
   public void run(){
        System.out.println("Play the Music");
    }
}
class Office extends Thread{
    public void run() {
        System.out.println("You are Flexible Working in the Office");
    }
        }
        class Sheet extends Thread {
    public int age;
            public Sheet(int age){
    this.age=age;
        }
    public void run(){
        if(age>18){
            System.out.println("Then Only that person working on the Excel Sheet");
        }
        else{
            System.out.println("Otherwise the Person age have the minor");
        }
        System.out.println("I am Doing from the Work Excel Sheet");
    }
        }
   public class Computer {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Your Age is Major"+" "+age);
        Thread[] m={new Music(),new Office(),new Sheet(age)};
        for(int i=0;i<m.length;i++) {
            m[i].start();
        }
    }
}

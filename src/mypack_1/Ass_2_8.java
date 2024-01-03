//8.	A student will not be allowed to sit in exam if his/her attendance is less than 75%.
//        Take following input from user
//        Number of classes held
//        Number of classes attended.
//        And print
//        percentage of class attended
//Is student is allowed to sit in exam or not.
        package mypack_1;

import java.util.Scanner;

public class Ass_2_8 {
    public static void main(String[] args) {
        Ass_2_8 obj=new Ass_2_8();
        obj.Attendance();
    }
    public Ass_2_8(){

    }
    public void Attendance(){
        int Number_of_classes=26;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of classes Attendend by the Student:");
        int a=sc.nextInt();
        int  classes_attended=a*100/(Number_of_classes);
        if(classes_attended<75){
            System.out.println("A student will not be allowed to sit in exam");
        }
        else{
            System.out.println("A student will allowed to sit in exam");
        }
        System.out.println("percentage of Student attended"+" "+classes_attended+"%");
    }
}

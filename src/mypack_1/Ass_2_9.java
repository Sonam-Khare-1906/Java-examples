//9.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and
// then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//And any other input of age should print "ERROR"


        package mypack_1;

import java.util.Scanner;

public class Ass_2_9 {
    public static void main(String[] args){
        Ass_2_9 obj=new Ass_2_9();
        obj.user_details();
    }

    public Ass_2_9() {

    }
    public void user_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        System.out.println("Enter Your Sex(Male or Female):");
        String emp = sc.next();
        System.out.println("Enter Your Martial Status(Yes or No):");
        String status=sc.next();
        if (emp.equalsIgnoreCase("female")) {
            System.out.println("She will work only in urban areas.");
        } else if (emp.equalsIgnoreCase("male")) {
            if (age < 40) {
                System.out.println("He may work in anywhere");
            } else if (age < 60) {
                System.out.println("He will work in urban areas only.");
            } else {
                System.out.println("The age Should not be matched");
            }
        } else {
            System.out.println("ERROR");
        }
    }
    }


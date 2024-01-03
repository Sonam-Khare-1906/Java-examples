//1) Write aJava program to test if an array contains a specific value.


import java.util.Scanner;
public class Numberfound {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num=sc.nextInt();
        int a []={4,8,9,3,2,6};
        boolean found = false;
        for(int i:a) {     //for each loop used for arrays and array list
            if (i == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number is Found");
                }
        else {
            System.out.println("Number is not Found");
        }
    }
}

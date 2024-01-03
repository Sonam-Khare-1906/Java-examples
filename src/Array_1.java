//write a java program to test if an array contain a specific value
import java.util.Scanner;
public class Array_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={45,25,78,2,5,65,87,98,23,27};
        for(int i=0;i< 10;i++) {
            System.out.print(arr[i]+" ");
        }
        boolean specific_value=false;
        System.out.println("Enter the Specific Value");
        int a=sc.nextInt();
        for(int value:arr){
            if(value==a){
                specific_value=true;
                break;
            }
        }
        if(specific_value){
            System.out.println("The Specific Value is matched");
        }
        else{
            System.out.println("The Specific Value is not matched");
        }

    }
}

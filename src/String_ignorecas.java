import java.util.Scanner;

public class String_ignorecas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the String1");
        String str1=sc.nextLine();
        if(str1.equalsIgnoreCase(str)){
            System.out.println("String is same");
        }
        else{
            System.out.println("String is not same");
        }

    }
}

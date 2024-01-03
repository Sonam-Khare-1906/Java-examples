import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String str=sc.nextLine();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the 2nd String");
        String str1=sc1.nextLine();
        boolean result=str.contains(str1);
        System.out.println(result);
    }
}

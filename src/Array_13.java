import java.util.Scanner;
public class Array_13 {
    public static void main(String[] args){
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<1;i++){
            System.out.println("Enter the values");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<1;i++){
            System.out.println("Enter the values");
            b[i]=sc.nextInt();
        }
        for(int i=0;i<1;i++){
            if(a[i]==b[i]){
                System.out.println("Arrays are equal");
            }
            else{
                System.out.println("Arrays are not equal");
            }
        }
    }

}

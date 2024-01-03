import java.util.Scanner;
public class cond_6 {
    public static void main(String[] args){
        Scanner row=new Scanner(System.in);
        System.out.println("No of rows:");
        int rows=row.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

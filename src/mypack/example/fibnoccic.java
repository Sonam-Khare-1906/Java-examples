package mypack.example;
import java.util.Scanner;
public class fibnoccic {
    public static int add(int x) {
        if (x <= 1) {
            return x;
        } else {
            int first_no = 0;
            int second_no = 1;
            int sum = 1;
            for (int i = 0; i < x; i++) {
                int result_1 = first_no + second_no;
                sum += result_1;
                first_no = second_no;
                second_no = result_1;
            }
            return sum;
        }
    }

    public static void main(String args[]) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter any Digit:");
        int a=c.nextInt();
        int result_1 = add(a);
        System.out.println(result_1);
    }
}


//Sum and product of the two arrays
//Single arrays
import java.util.Scanner;
public class Arr_1 {
    public static void main(String[] args) {
        int a[] = new int[2];

        int sum = 0;
        int product = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the number");
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the number");
            a[i] = sc.nextInt();
            product = product*a[i];
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Sum of the numbers" + sum);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Product of the numbers" + product);
        }

// two different arrays
        int sum1 = 0;
        int product1 = 1;
        Scanner sc1 = new Scanner(System.in);
        int arr[] = new int[2];
        int arr1[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number:");
            arr[i] = sc.nextInt();
            sum1 += arr[i] + arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the number:");
            arr1[i] = sc.nextInt();
            product1 *= arr1[i] * arr[i];
        }
        System.out.println("Sum of the 2 no:" + sum);
        System.out.println("Product of the 2 no:" + product);
    }
}
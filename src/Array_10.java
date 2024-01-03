//take 10 integers inputs from user and store them in an array.
// now copy all elements in an other array but in reverse order
import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Integer");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            System.out.println(i + 1);
        }
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = arr[arr.length - 1 - i];
            System.out.println("Original Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("Reversed Array:");
            for (int num : arr1) {
                System.out.print(num + " ");
            }
        }
    }
}

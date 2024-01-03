//10)Write a Java program to find duplicate values in an array of integer values.
import java.util.Scanner;

public class Array_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {40, 33, 10, 12, 40, 10, 5, 8, 15, 78, 5, 27};
        int count = 0;
        System.out.println("Enter the value");
        int duplicate = sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (duplicate == i) {
                    System.out.println("The duplicate values" + arr[i]);
                    count++;
                } else {
                    System.out.println("The duplicate values are not found");
                }
            }
        }
    }
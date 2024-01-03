import java.util.Scanner;

public class Arr_maxmin {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the Values:");
            marks[i] = sc.nextInt();
        }
        max = marks[0];
        min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        for (int j = 0; j < marks.length; j++) {
            if (marks[j] < min) {
                min = marks[j];
            }
        }
        System.out.println("Maximum Value:" + max);
        System.out.println("Minimum Value:" + min);
    }

}
import java.util.Scanner;
//create a array 5 students take a students input and find out avg of marks and print value
public class Array {
    public static void main(String[] args) {
//        int marks[]={52,75,62,32,43};
//        System.out.println(marks[2]);//Specific index number
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);



        //Sum of the marks in avg
//        int [] marks=new int[5];
//        int avg = 0;
//        int sum=0;
//            Scanner sc=new Scanner(System.in);
//            for(int i=0;i<marks.length;i++) {
//                System.out.println("Please enter the marks");
//                marks[i] = sc.nextInt();
//                avg = avg + marks[i];
//                sum = avg/5;
//            }
//                System.out.println(sum);

// program to the input from 5 string names
//        String[] str = new String[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < str.length; i++) {
//            System.out.println("Please enter the name");
//            str[i] = sc.nextLine();
//        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }


        // 10 integers are an input to check even,odd,positive,negative count in numbers
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        int even_count=0;
        int odd_count=0;
        int positive=0;
        int negative=0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Please enter the number");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                even_count++;
                System.out.println("It is a even number"+even_count);
            } else if (num[i] != 0) {
                odd_count++;
                System.out.println("It is a Odd number"+odd_count);
            }
            if (num[i] > 0) {
                positive++;
                System.out.println("It is a Positive number"+positive);
            } else {
                negative++;
                System.out.println("It is a Negative number"+negative);
            }
        }
        for (int i = 0; i < num.length; i++) {
          System.out.println(num[i]);
      }
        }
    }


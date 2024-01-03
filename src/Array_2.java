import java.util.Arrays;
import java.util.Scanner;

//Write a java program to remove a specific element from an array index a number you can make it
public class Array_2 {
    public static void main(String[] args) {
        int[] arr = {74, 25, 45, 12, 10, 35, 96, 85, 11, 49};
        Scanner sc = new Scanner(System.in);
       for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
     System.out.println("Enter any value to remove an array");
//        int r=sc.nextInt();
//        boolean remove_value=false;
//        for(int value:arr){
//            if(value==r){
//                remove_value=true;
//                break;
//            }
//        }
        int remove=1;
          for(int i=remove;i< arr.length-1;i++){
              arr[i]=arr[i+1];
             System.out.print(Arrays.toString(arr)+" ");
          }
        }
    }


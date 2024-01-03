import java.util.Scanner;

public class D_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Enter the value");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//            for (int i = 0; i < 1; i++) {
//                for (int j = 0; j < 1; j++) {
//                    System.out.println("The values"+arr[i][j]);
//                }
//            }
            int [][]arr={{34,20,16},{7,9,12},{1,4,65}};
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
//                     if(i==j){
//                         System.out.print(arr[i][j]+",");
//                    }
//                    if(j==1){
//                        System.out.print(arr[i][j]+",");
//                }
//                    if(i==1){
//                        System.out.print(arr[i][j]+",");
//                    }
//                    if(i==j+1 || j==i+1) {
//                            System.out.print(arr[i][j] + ",");
//                        }
                    if(i==j+2 || j==i+2) {
                       System.out.print(arr[i][j] + ",");
                     }
                    }
              }
            }
        }


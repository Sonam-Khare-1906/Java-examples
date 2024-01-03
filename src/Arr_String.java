import java.util.Arrays;
import java.util.Scanner;

public class Arr_String {
    public static void main(String[] args){
        String [] colors=new String[5];
        for(int i=0;i<colors.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any color name:");
            colors[i]=sc.nextLine();
        }
        Arrays.sort(colors);
            System.out.println("Sorted arrays:"+  Arrays.toString(colors));
        }
    }


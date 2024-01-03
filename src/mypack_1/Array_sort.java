//5.	Write down the names of 10 of your friends in an array and
// then sort those in alphabetically ascending order.

package mypack_1;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        String[] names = new String[]{"Rahul", "Risheek", "Aswini", "Sangeetha", "Chetna", "Bhargav", "Tripathi", "Abhishek", "Jagadish"};
       Arrays.sort(names);
        System.out.println("Ascending Order:");
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }
    }
}
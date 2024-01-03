//2.	Write a Java program to concatenate a given string to the end of another string.
//Sample Output:
//i.	String 1: PHP Exercises and
//ii.	String 2: Python Exercises
//iii.	The concatenated string: PHP Exercises and Python Exercises

package mypack_1;

public class String_Concat {
    public static void main(String[] args){
        String str1="PHP Exercises and";
        String str2=" Python Exercises";
        String concat=str1.concat(str2);
        System.out.println("The concatenated string:"+concat);
    }
}

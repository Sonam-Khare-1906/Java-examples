//To read the data in bufferedReader same like a Scanner class

package InputOutput_Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_examples {
    public static  void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);//is reading the bytes to convert into character
        BufferedReader bf=new BufferedReader(r);//it is temporary memory to store the data or display or read
        System.out.println("Enter Your Name:");
        String name=bf.readLine();//to read the whole sentence
        System.out.println("Welcome"+name);

    }
}

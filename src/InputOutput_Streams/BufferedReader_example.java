package InputOutput_Streams;

import java.io.*;

public class BufferedReader_example {
    public static void main(String[] args) throws IOException {
        char[] array = new char[50]; //Character to read the array
        try {
            FileReader file = new FileReader("file.txt");// filereader
            BufferedReader input = new BufferedReader(file);//that file will store in buffered reader and then read
            input.read(array); //store into character array and show it                 //to read line by line
            System.out.println("Data in the Program");
            System.out.println(array);
            input.skip(5);
            System.out.println("Data in the Program");
            System.out.println(array);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        String data = "this is the java class developer";
        try {
            FileWriter file_1 = new FileWriter("file.txt");
            BufferedWriter output = new BufferedWriter(file_1);
            output.write(data);
            output.append("hello World");
            System.out.println(data);
        } finally {

        }
    }
}

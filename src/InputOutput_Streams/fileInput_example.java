//To read the file using Input Stream using loop we donnot use loop concepts then it read only one character
package InputOutput_Streams;

import java.io.FileInputStream;

public class fileInput_example {
    public static void main(String[] args){
        try {
            FileInputStream fs = new FileInputStream("hello.txt");
            int x = 0;
            while ((x = fs.read()) != -1) {
                System.out.print((char) x);
            }
            fs.close();
        }
        catch (Exception e){

        }
    }
}

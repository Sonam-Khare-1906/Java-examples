//It will only to write anything of the file we cannot create String directly we can create bytes in below, we can create integer,char only Assic values


package InputOutput_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_example {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("hello.txt");
            fs.write('A');
            fs.write('B');
            fs.write('C');
            fs.write('D');
            fs.write('E');
            String s="Hello Welcome To Input Output Stream";//String create to convert byte
            byte b[]=s.getBytes();
            fs.write(b);
            fs.close();
            System.out.println("Done.....");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

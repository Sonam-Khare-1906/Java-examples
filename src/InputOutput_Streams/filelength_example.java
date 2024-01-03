package InputOutput_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filelength_example {
    public static void main(String[] args){
        try {
            FileOutputStream fi = new FileOutputStream("file.txt");
            String s="Good Morning Everyone";
            byte b[]=s.getBytes();
            fi.write(b);
            System.out.print("File created");
        }
        catch (Exception e){

        }
        try{
            FileInputStream fo=new FileInputStream("file.txt");
            byte b[]=fo.readAllBytes();
            int x;
            while((x = fo.read()) != -1){
                System.out.print((char) x);
            }
            System.out.print("length of the file:"+b.length);
            fo.close();
        }
        catch(Exception e1){

        }
    }
}

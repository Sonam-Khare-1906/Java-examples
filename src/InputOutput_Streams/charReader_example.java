package InputOutput_Streams;

import java.io.*;

public class charReader_example {
    public static void main(String[] args){
//        try {
//            Writer w = new FilterWriter("file_1.txt") {
//                String st = "Java Full Stack Developer";
//                byte b[]=st.getBytes();
//                w.write(st);
//                System.out.println("Completed....")
//            }
//        }
//            catch(IOException e1){
//            }
            try {
                Reader r = new FileReader("file.txt");
                int x = r.read();
                while (x != -1) {
                    System.out.print((char) x);
                    x = r.read();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}

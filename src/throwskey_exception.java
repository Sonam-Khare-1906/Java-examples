import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class throwskey_exception {
    public class throws_exception{
        public static void check_file()throws IOException
        {
            File newfile=new File("abc.txt");
            FileInputStream s=new FileInputStream(newfile);
        }
    }
    public static void main(String[] args)
    {
//        throws_exception ee= new throws_exception();
//        ee.check_file();
//        try
//        {
////            check_file();
//        }catch (IOException i)
//        {
//           System.out.println("Exception handling");
//    }
    }
}

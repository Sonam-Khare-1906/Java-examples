//lambda Expression is provide to implementation of interface only not for class

package Collections.Java_8;


interface inter{
    public String method(String s);
}
public class lambda_Exp {
    public static void main(String[] args){
        inter i=(s1)->{                   //it was used here lambda expression and end with semicolon
            return "hello Everyone"+ s1;
        };
        System.out.println(i.method("java"));

    }
}

package Collections.Java_8;


interface method_r{
    public void multiply(int n,int m);
}
public class Method_Ref {
    public static  void hello(int n,int m){
        int s=n*m;
        System.out.println(s);
        System.out.println("hello");
    }
    public static void main(String[] args){
        method_r r=Method_Ref::hello;
        r.multiply(4,5);

    }
}

//Anonymous class with create interface object and then that part to end part is called Anamonys cls

package Collections.Java_8;


interface my{
    public void method();
}
public class Anamonus_cls {
    public static void main(String[] args){
        my m=new my(){
            int x=10;
            public void method(){
                System.out.println(x);
            }
        };
        m.method();
    }
}

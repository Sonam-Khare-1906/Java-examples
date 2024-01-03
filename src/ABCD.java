 interface AA {
    void a();
    void b();
    void c();
    void d();
}
abstract class BB implements AA{  //Abstract class cannot create objects of constructor
    public void c(){
        System.out.println("C is a method");
    }
}
class D extends BB{

    @Override
    public void a() {
        System.out.println("A is a method");

    }

    @Override
    public void b() {
        System.out.println("B is a method");

    }

    @Override
    public void d() {
        System.out.println("D is a method");

    }
}
public class ABCD {
    public static void main(String[] args){
        AA obj=new D();//Here we use the constructor through with the help of Interface and class D
        obj.a();
        obj.c();
        obj.b();
        obj.d();

    }
}
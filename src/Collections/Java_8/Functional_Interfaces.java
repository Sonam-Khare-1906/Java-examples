package Collections.Java_8;

interface Functional_Interfaces {
    public void sayhello(String s);
    default void my_hello(){
        System.out.println("Hello Everyone");
    }
    default void my(){
        System.out.println("Hello");
    }
class Functions{
    public void my(){
        System.out.println("Hello mam");
    }
}

    public static void main(String[] args) {
 Functions f=new Functions();
 f.my();
    }
}

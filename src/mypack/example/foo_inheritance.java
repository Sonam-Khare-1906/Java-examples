package mypack.example;
public class foo_inheritance {
    public static void main(String[] args){
        Foo[] pity={new Baz(),new Bar(),
        new Mumble(),new Foo()};
        for(int i=0;i< pity.length;i++){
            System.out.println(pity[i]);
            pity[i].method1();
            pity[i].method2();
            System.out.println();
        }
    }
}
class Foo {
    public void method1(){
        System.out.println("Foo 1");
    } public void method2(){
        System.out.println("Foo 2");
    }
    public String toString(){
        return "Foo";
    }
}
 class Bar extends Foo{
    public void method2(){
        System.out.println("Bar 2");
    }
}
 class Baz extends Foo{
    public void method1(){
        System.out.println("Baz 1");
    }
    public String toString(){
        return "baz";
    }
}
class Mumble extends Baz{
    public void method2(){
        System.out.println("Mumble 2");
    }
}

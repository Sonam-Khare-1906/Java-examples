package mypack.example;

public class Ant {
    private String x="Ax";
    protected String y="Ay";
    public String z="Az";
    public String toString(){
        return  x+y+z;
    }
    public static void main(String[] args){
        Ant a=new Ant();
        System.out.println("A for Ant");
        System.out.println(a);
        Ball b=new Ball();
        System.out.println("B for Ball");
        System.out.println(b);
        Cat c=new Cat();
        System.out.println(c);
        System.out.println("C for Cat");
        Dog d=new Dog();
        System.out.println(d.y);
        System.out.println(d);
    }
}
class Ball extends Ant{
    private String x="Bx";
    public String z="Bz";
    public String toString(){
        return x+y+z;
    }
}
 class Cat extends Ant{
    private String x="Cx";
}
class Dog extends Ant{
    private String x="Dx";
    private String z="ZA";
}

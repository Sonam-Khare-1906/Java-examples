
package mypack.example;

public class Inheritance_polymorphism extends SuperClass {
    public Inheritance_polymorphism( int x){
            super(x);
        }
        public void display () {
            add(2);
            super.display();
        }
        public static void main(String[] args) {
        Inheritance_polymorphism c= new Inheritance_polymorphism(1);
        c.display();
        c = new Inheritance_polymorphism(3);
        c.display();

    }
}
class SuperClass{
    protected int x=0;
    public SuperClass(int x){
        this.x=x;
    }
    private void increment(){
        x++;
    }
    protected final void add(int y){
        x+=y;
    }
    public void display(){
        System.out.println(x);
    }
}


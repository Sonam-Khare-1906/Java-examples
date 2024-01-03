//Create a class Degree having a method getDegree that prints "I got a degree".it has two subclasses namely "Undergraduate"
//and 'postgraduate' each having a method with the same name that prints "I am an undergraduate" and "I am a postgraduate" respectively
//call the method by creating an object of each of the three classes.
package mypack.example;

public class Degree {
    String name;
    public Degree(){

    }
    public void getDegree(){
        System.out.println("I got a degree");
    }

    public static void main(String[] args){
   Degree D=new Degree();
   D.getDegree();
   Undergraduate u=new Undergraduate();
   u.getDegree();
   Postgraduate p=new Postgraduate();
   p.getDegree();
    }
}
class Undergraduate extends Degree{
    public Undergraduate(){
    }
    public void getDegree(){
        System.out.println("I got a Undergraduate");
    }
}
class Postgraduate extends Degree{
    public Postgraduate(){
    }
    public void getDegree(){
        System.out.println("I got a Postgraduate");
    }
}

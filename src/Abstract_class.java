public class Abstract_class {
    public static void main(String[] args){
        Bird[] B={new Duck(),new Owl()};
        for(int i=0;i<B.length;i++){
            B[i].makeSound();
            B[i].makeSound();
        }

    }
}
abstract class Bird {
    abstract void makeSound();
}
class Duck extends Bird{
    public void makeSound(){
        System.out.println("The sound that a Duck makes:Quack Quack");

    }
}
class Owl extends Bird{
    public void makeSound(){
        System.out.println("The sound that an Owl makes:Hoot Hoot");

    }
}

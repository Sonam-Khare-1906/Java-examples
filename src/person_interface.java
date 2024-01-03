public class person_interface {
    public static  void main(String[] args){
        person obj=new person();
        obj.swim();
        obj.walk();

    }
}
interface walk{
    public void walk();
}
interface swim{
    public void swim();
}
class person implements walk,swim{
    @Override
    public void walk() {
        System.out.println("Person are walking");
    }

    @Override
    public void swim() {
        System.out.println("Person is Swimming");

    }
}
public class Abstract_class_exp {
    public static void main(String[] args){
        childs c=new childs();
        c.message();
        c.show();
    }
}
abstract class hello{
    abstract void show();//Abstract Method only for declaration not written anything
    void display(){

    }
}
interface AB{
    public void message();
}
interface BC{
    public void message();
}
class childs extends hello implements AB,BC{
    public void message(){
        System.out.println("Implements interface");
    }

    @Override
    void show() {
        System.out.println("This is the abstract class");
    }
}

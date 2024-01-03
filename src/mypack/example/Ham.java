package mypack.example;

public class Ham {
    public static void main(String[] args) {
        Hams[] food = {new Hams(), new Lamb(),new Yam(), new Spam()};
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
            food[i].a();
            food[i].b();
            System.out.println();
        }
    }
}
class Hams{
    public void a(){
        System.out.println("Ham a");
    }
    public void b(){
        System.out.println("Ham b");
    }
    public String toString(){
        return "ham";
    }
}
class Lamb extends Hams{
    public void b(){
        System.out.println("Lamb b");
    }
}
class Yam extends Lamb{
    public void a(){
        System.out.println("Lamb b");
    }
    public String toString(){
        return "Yam";
    }
}
class Spam extends Yam {
    public void a() {
        System.out.println("Spam b");
    }
}

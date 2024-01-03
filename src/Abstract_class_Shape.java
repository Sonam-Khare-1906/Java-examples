public class Abstract_class_Shape {
    public static  void main(String[] args){
        Triangless t=new Triangless();
        t.Area();
        t.perimeter();

    }
}
abstract class Shapes{
    abstract void Area();
    void display(){

    }
}
interface S{
    public void perimeter();
}
class Triangless extends Shapes implements S{
    public void perimeter() {
        int side1 = 8;
        int side2 = 9;
        int side3 = 5;
        int total = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle:"+total);
    }
        void Area(){
         int length=8;
         int bredth=5;
         int area=(length*bredth)/2;
            System.out.println("Area of a Tringle:"+area);

        }

    }


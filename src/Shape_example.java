//Method overriding

public class Shape_example {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getArea();
        circle ci = new circle();
        ci.getArea();
    }
}
    class Rectangle extends Shape_example {

      public Rectangle(){

      }
        int length = 5;
        int breadth = 8;
        int Area_rectangle = length * breadth;

        public void getArea() {
            System.out.println("Area of rectangle:" + Area_rectangle);
        }
    }
class circle extends Shape_example{
    public circle(){

    }
    int radius=5;
    double result=3.14*radius*radius;
    public void getArea() {
        System.out.println(result);

    }
}

public class Shape_interface {
    public static void main(String[] args){
        Rectangles s=new Rectangles();
        s.getArea();
        Circles c=new Circles();
        c.getArea();
        Triangles t=new Triangles();
        t.getArea();
    }
}
interface Shape{
    public void getArea();
}
class Rectangles implements Shape{
    @Override
    public void getArea() {
        int length=4;
        int breadth=6;
        int rectangle=length*breadth;
        System.out.println("Area of the Rectangle:"+" "+rectangle);
    }
}
class Circles implements Shape{
    @Override
    public void getArea() {
        int area=9;
        double Circle=(3.14*area*area);
        System.out.println("Area of the Circle:"+" "+Circle);
    }
}
class Triangles implements Shape{
    @Override
    public void getArea() {
        int height=5;
        int breadth=6;
        int Triangle=(height*breadth)/2;
        System.out.println("Area of the Triangle:"+" "+Triangle);
    }
}

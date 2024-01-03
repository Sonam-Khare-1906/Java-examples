package mypack.example;

public class Shapess extends abstract_example implements Shape {
    @Override
    void area() {
        int length = 8;
        int breadth = 9;
        int result = length * breadth / 2;
        System.out.println("Area of the Triangle:" + result);
        int area=6;
        double Pie=Math.PI*area*area;
        System.out.println("Area of the Circle:"+Pie);
    }

    //Perimeter of the Triangle
    @Override
    public void perimeter() {
        int side = 7;
        int side2 = 8;
        int side3 = 16;
        int result = side + side2 + side3;
        System.out.println("Perimeter of the triangle:" + result);

        //circle of the perimeter
        int radius = 85;
        double per = Math.PI * 2 * radius;
        System.out.println("Perimeter of the Circle:" + per);

    }
}
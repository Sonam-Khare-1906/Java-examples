//create a class shape overload the method called area find the area of the circle,square
public class shape_method {
    int area;
    double radius;
    int length;
int breadth;
    public void area(int a){
        this.area=a;
        System.out.println("Area of Circle:"+(3.14*a*a));
    }
    public void area(double r){
       this.radius=r;
        System.out.println("Area of Square:"+(r*r));
    }
    public void area(int l,int b){
       this.length=l;
      this.breadth=b;
        System.out.println("Area of Rectangle:"+(l*b));
    }
    public static void main(String[] args){
     shape_method s=new shape_method();
     s.area(5);
     s.area(2.2);
     s.area(8,9);
    }
}

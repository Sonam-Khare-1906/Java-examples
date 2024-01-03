//compile time polymorphism---->method overloading
public class polymorphism_example {
    int x;
    int y;
    double z;
    public void addition(int a,int b){
        x=a;
        y=b;
        System.out.println("Addition of two numbers:"+(x+y));
    }
    public void addition(double a,int b){
        z=a;
        y=b;
        System.out.println("Addition of two numbers:"+(z+y));
    }
    public static void main(String[] args){
        polymorphism_example p=new polymorphism_example();
     p.addition(45,25);
        p.addition(45.25,25);
    }
}
//create a class shape overload the method called area find the area of the circle,square
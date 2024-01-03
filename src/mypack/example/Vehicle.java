//Inheritance--->Method over
//Write a java program to create a class vehicle with a method called speedup().
//Create two subclasses car and bicycle.override the speedup() method in each subclass to increase
//the vehicle's speed differently.
package mypack.example;
public class Vehicle {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.speedup();
        Car c = new Car();
        c.speedup();
        Bicycle b=new Bicycle();
        b.speedup();
    }
    int speed=20;
    public Vehicle() {

    }
    public void speedup() {
        speed+=50;
        System.out.println("Speed of the Vehicle:"+speed);
    }
}

    class Car extends Vehicle {
        public Car() {
        }

        public void speedup() {
            speed+=20;
            System.out.println("Speed of the Vehicle:"+speed);
        }
    }

    class Bicycle extends Vehicle {
        public Bicycle() {
        }
        public void speedup() {
            speed+=30;
            System.out.println("Speed of the Vehicle:"+speed);
        }
    }

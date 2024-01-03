//Creating a interface and implementing classes.
//we cannot create a non-abstract methods.
package Practice_Programs;
 interface Vehicles {
    abstract void start_Engine();
}
class Car implements Vehicles {
    public void start_Engine() {
        String start= "10 Sec";
        System.out.println("Car to Start Engine in"+" "+start);
    }
}
class Scooter implements Vehicles {
    public void start_Engine() {
        String start = "15 Sec";
        System.out.println("Scooter to Start Engine in" + " " + start);
    }
}
class Truck implements Vehicles {
    public void start_Engine() {
        String start="30 Sec";
        System.out.println("Truck to Start Engine in" + " " + start);
    }
}
public class Vehicle{
    public static void main(String args[]) {
        Vehicles[] v = {new Car(), new Scooter(), new Truck()};
        for (int i = 0; i < v.length; i++) {
            v[i].start_Engine();
            System.out.println();
        }
    }
}

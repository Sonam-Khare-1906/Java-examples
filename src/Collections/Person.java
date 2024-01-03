package Collections;

import java.util.HashMap;
import java.util.Map;

public class Person {
    Integer phone;
    String name;
    String city;

    public Person(String name, Integer phone, String City) {
        this.name = name;
        this.city = City;
        this.phone = phone;
    }

    public static void main(String[] args) {
        Person p = new Person("Aswini", 587485254, "Uttarakhand");
        Person p1 = new Person("Risheek", 857425100, "Chennai");
        Person p2 = new Person("Chetna", 784885100, "Rajasthan");
        Person p3 = new Person("Smitha", 957254100, "Mumbai");
        Person p4 = new Person("Tripthi", 985745821, "Delhi");
        Person p5 = new Person("Bhargav", 987445821, "Hyderabad");
        Person p6 = new Person("Sangeetha", 988874821, "Visakhapatnam");

        Map<Integer, Person> m = new HashMap<Integer, Person>();
        m.put(1, p);
        m.put(2, p1);
        m.put(3, p2);
        m.put(4, p3);
        m.put(5, p4);
        m.put(6, p5);
        m.put(7, p6);
        System.out.println("Person Details");
        for (Map.Entry<Integer, Person> map : m.entrySet()) {
            System.out.println(map.getKey());
        }
    }
}

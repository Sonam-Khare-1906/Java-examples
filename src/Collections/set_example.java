package Collections;

import java.util.HashSet;
import java.util.Set;

public class set_example {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        s.add(25);
        s.add(85);
        s.add(98);
        s.add(32);
        s.add(81);
        s.add(98);
        System.out.println(s);
       int s2=s.hashCode();
        System.out.println(s2);



    }
}

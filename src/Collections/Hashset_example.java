package Collections;
import java.util.*;

public class Hashset_example {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Mahanadi");
        s.add("Godavari");
        s.add("Krishna");
        s.add("Brahmaputra");
        s.add("Kaveri");
        s.add("Yamuna");
        s.add("Ganga");
        s.add("Indus");
        s.add("Penna");
        System.out.println(s);
        for (Object obj : s.toArray()) {
            System.out.println(obj);
        }
        Class<? extends HashSet> hashSetClass = (Class<? extends HashSet>) s.getClass();
        System.out.println("Class of the set: " + hashSetClass);


        SortedSet<String> str = new TreeSet<>();
        str.add("Mahanadi");
        str.add("Godavari");
        str.add("Krishna");
        str.add("Mahanadi");
        str.add("Godavari");
        str.add("Krishna");
        str.add("Brahmaputra");
        str.add("Kaveri");
        str.add("Yamuna");
        str.add("Ganga");
        str.add("Indus");
        str.add("Penna");
        System.out.println("Rivers of the Names:"+str);
        for (Object element : str.toArray()) {
            System.out.println(element);
        }
    }
}




package Collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Dequeue_example {
    public static void main(String[] args) {
        Deque<String> d = new LinkedList<>();
        d.add("Sakshi");
        d.add("Anil");
        d.add("Chirag");
        d.add("Abhishek");
        d.add("Bhavani");
        d.add("Danvishka");
        d.add("Akshara");
        System.out.println(d);
        d.addFirst("Devi");
        d.addLast("samiksha");
        System.out.println(d);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(d.remove());
        System.out.println(d);
        System.out.println(d.poll());
        d.peekLast();
        System.out.println(d);
        d.peekFirst();
        System.out.println(d);
        d.size();
        System.out.println(d.size());
        d.offerFirst("Adhithi");
        System.out.println(d);



    }
}

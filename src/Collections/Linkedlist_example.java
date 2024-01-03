package Collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_example {
    public static void main(String[] args){
        List<String> list1=new LinkedList<>();
        list1.add("Chetna");
        list1.add("Smitha");
        list1.add("Risheek");
        list1.add("Chandu");
        list1.add("Sangeetha");
        list1.add("Tripthi");
        list1.add("Aswini");
        System.out.println("List of the Names:"+list1);

        list1.addFirst("Sakshi");
        list1.addLast("Bhargav");
        System.out.println("Added Names of the list:");

        for (String s : list1.toArray(new String[0])) {
            System.out.println(s);
        }

        List<String> list2=new LinkedList<>(list1);//cloning the list of elements
        System.out.println("List of the names:"+list2);

        boolean contains =list2.contains("Tripthi");
        System.out.println("List of the names:"+contains);

        boolean containsAll=list2.containsAll(Collections.singleton(""));
        System.out.println("List of the names:"+containsAll);

        Iterator x= ((LinkedList<String>) list2).descendingIterator();
        System.out.println("List of the reverse order names:");
        while(x.hasNext()){
            System.out.println(x.next());
        }

        boolean s=((LinkedList<String>) list2).offer("chetna");//ignore-case type
        System.out.println("List of the namessss:"+s);

        String O= list2.set(7,"Sonam");  //to replace the name based on index value
        System.out.println("List of the names:"+O);
        System.out.println("List of the names:"+list2);


    }
}
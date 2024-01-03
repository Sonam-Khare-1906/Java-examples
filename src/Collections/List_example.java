package Collections;
import java.util.ArrayList;
import java.util.List;
public class List_example {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Neethu");
        list1.add("Sonu");
        list1.add("Madhu");
        list1.add("Arvind");
        list1.add("Sonam");
        System.out.println("List of the names ----> " + list1);
        list1.add(2,"Sowmya");
        System.out.println("List of the names at specific index ----> " + list1);
        list2.addAll(list1);
        System.out.println("List of the names ----> " + list2);
        list2.add("Subhash");
        list2.add("Kanchan");
        System.out.println("Adding List of the names ----> " + list2);
        System.out.println("length of the names ----> " + list2.size());
        list1.remove(3);
        System.out.println("remove List of the names ----> " + list1);
        list1.contains(list2);
        System.out.println("List of the names contains ----> " + list2);
    }
}

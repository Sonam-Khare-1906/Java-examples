package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_example {
    public static void main(String[] args){
        Map<Integer,String> m=new HashMap<Integer, String>();
        m.put(1,"Aswini");
        m.put(2,"Risheek");
        m.put(3,"Chetna");
        m.put(4,"Bhargav");
        m.put(5,"Smitha");
        m.put(6,"Sonam");
        m.put(7,"Chandu");
        m.put(8,"Sangeetha");
        System.out.println("Map Elements:");
        for(Map.Entry<Integer,String> map:m.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
        m.getOrDefault(6,null);
        System.out.println("Map Elements get or Default :"+m);

        m.putIfAbsent(4,"John");
        m.putIfAbsent(8,"Susma");
        m.putIfAbsent(5,"Ravi");
        m.putIfAbsent(1,"Lakshmi");
        m.putIfAbsent(9,"Divya");
        System.out.println("Map Elements:"+m);
    }
}

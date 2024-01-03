

//Stream API is used for Code less in a single line
package Collections.Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        List<String> names=new ArrayList<String>();
        names.add("Madhu");
        names.add("Arvind");
        names.add("Sonu");
        names.add("Neethu");
//        int count=0;
//        for(String s:names){
//            if(s.length()>6){
//                System.out.println("Count of the names"+s);
//                count++;
//            }
//        }


        //Here is used for Stream Filter with lambda expression

        //Printing count
        Stream<String> s1=names.stream();
        long count=s1.filter(str->str.length()>4).count();
        System.out.println("Count of the names"+count);


        //printing names
        Stream<String> s2=names.stream().filter(str1->str1.length()>4 && str1.length()<8);
        s2.forEach(s3->System.out.println(s3+" "));


        //Here printing the names using list class and collector class
        List<String> s4=names.stream().filter(str1->str1.length()>4 && str1.length()<8).collect(Collectors.toList());
        s4.forEach(s3->System.out.print(s3+" "));
    }
    }

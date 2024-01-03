package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 class Student_1{
     String name;
     Integer age;

     Student_1(String s1, Integer a1) {
         this.name = s1;
         this.age = a1;
     }
 }

     class compareAge implements Comparator<Student_1> {
         @Override
         public int compare(Student_1 s2, Student_1 s3) {
             if (s2.age == s3.age)
                 return 0;
             else if (s2.age > s3.age)
                 return 1;
             else
                 return -1;
         }
     }

     class comparename implements Comparator<Student_1> {
         public int compare(Student_1 s1, Student_1 s2) {
             return s1.name.compareTo(s2.name);
         }
     }
         public class comparator_example {
             public static void main(String[] args) {
                 Student_1 ss1 = new Student_1("Ayush", 55);
                 Student_1 ss2 = new Student_1("Samiyra", 43);
                 Student_1 ss3 = new Student_1("Sakhsi", 25);

                 ArrayList<Student_1> a1 = new ArrayList<>();
                 a1.add(ss1);
                 a1.add(ss2);
                 a1.add(ss3);
                 System.out.println("Sorting by age....");
                 Collections.sort(a1,new compareAge());
                 for (Student_1 st : a1) {
                     System.out.println(st.name + " " + st.age);
                 }
                 System.out.println("Sorting by name....");
                 Collections.sort(a1,new comparename());
                 for (Student_1 st : a1) {
                     System.out.println(st.name + " " + st.age);
                 }
         }
     }


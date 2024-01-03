package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>//Comparator
{
    String name;
    int age;

    Student(String s1, int a1) {
        this.name = s1;
        this.age = a1;
    }


    public int compareTo(Student s1) {//compare method
        if (age == s1.age) {
            return 0;
        } else if (age > s1.age) {
            return 1;

        } else {
            return -1;
        }
    }
}

    public class compare_example {
        public static void main(String[] args) {
            Student s1 = new Student("Ayush", 55);
            Student s2 = new Student("Samiyra", 43);
            Student s3 = new Student("Sakhsi", 25);

            ArrayList<Student> a1 = new ArrayList<>();
            a1.add(s1);
            a1.add(s2);
            a1.add(s3);

            Collections.sort(a1);
            for (Student st : a1) {
                System.out.println(st.name + " " + st.age);
            }
        }
    }


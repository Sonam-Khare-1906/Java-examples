package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    String name;
    int roll;
    int marks;

    Students(String s, int r, int m) {
        this.name = s;
        this.roll = r;
        this.marks = m;
    }
}
public class Students_1 {
    public static void main(String[] args) {
        Students s1 = new Students("Akash", 5251, 90);
        Students s2 = new Students("Sumathi", 5252, 87);
        Students s3 = new Students("Sudheer", 5253, 85);
        ArrayList<Students> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);

        //lambda Expressions using 2 varaibles and store the c value
        Comparator <Students> c=(a,b)->{
         return a.marks-b.marks;
        };

        Collections.sort(a1,c);

        for (Students s : a1) {
            System.out.println(s.name + " " + s.roll + " " + s.marks);
        }
    }
}
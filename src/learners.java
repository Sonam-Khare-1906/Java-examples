import java.util.Scanner;
public class learners {
    String name;
    int enroll_no;
    int Java_marks;
    int Sql_marks;
    int Angular_marks;
    int Html_marks;
    int Total_marks;
    int Average;
    public learners(){
        name="Sai Rama";
        enroll_no=212206009;
        Java_marks=90;
        Sql_marks=85;
        Angular_marks=70;
        Html_marks=87;
        Total_marks=(Java_marks+Sql_marks+Angular_marks+Html_marks);
        Average=(Java_marks+Sql_marks+Angular_marks+Html_marks)/4;
        System.out.println("Name of the Student"+" "+name+" "+ enroll_no);
        System.out.println("Java_marks"+"-"+Java_marks);
        System.out.println("Sql_marks"+"-"+Sql_marks);
        System.out.println("Angular_marks"+"-"+Angular_marks);
        System.out.println("Html_marks"+"-"+Html_marks);
        System.out.println("Total marks obtained by the Student"+"-"+Total_marks);
        System.out.println("Total Percentage obtained by the Student"+"-"+Average);
        Grade(Average);
    }
    public learners(String a,int roll_no,int java_marks,int sql_marks,int angular_marks,int html_marks,int total_marks,int avg ){
       name=a;
       enroll_no=roll_no;
       Java_marks=java_marks;
       Sql_marks=sql_marks;
       Angular_marks=angular_marks;
       Html_marks=html_marks;
       Total_marks=total_marks;
       Average=avg;
           avg=(Java_marks+Sql_marks+Angular_marks+Html_marks)/4;
        System.out.println("Name of the Student"+" "+a+" "+roll_no);
        System.out.println("Java_marks"+"-"+java_marks);
        System.out.println("Sql_marks"+"-"+sql_marks);
        System.out.println("Angular_marks"+"-"+angular_marks);
        System.out.println("Html_marks"+"-"+html_marks);
        System.out.println("Total marks obtained by the Student"+"-"+total_marks);
        System.out.println("Total Percentage obtained by the Student"+"-"+avg);
        Grade(avg);
//        if(Avg>80){
//            System.out.println(a+" "+"Grade is A");
//        }
//        else if(Avg<80 && Avg>60){
//            System.out.println(a+" "+"Grade is B");
//        }
//        else if(Avg<60 && Avg>50){
//            System.out.println(a+" "+"Grade is C");
//        }
//        else if(Avg<50 && Avg>45){
//            System.out.println(a+" "+"Grade is D");
//        }
//        else if(Avg<45 && Avg>25){
//            System.out.println(a+" "+"Grade is E");
//        }
//        else{
//            System.out.println(a+" "+"Grade is F");
//        }
    }
    public static void main(String[] args){
        learners ln=new learners();
        learners ln1=new learners("Neethu Khare",210020654,80,75,80,87,80+75+80+87,4);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the learner Name:");
//        String a=sc.nextLine();
//        Scanner sc1=new Scanner(System.in);
//        System.out.println("Enter the enroll_no:");
//        int roll_no=sc1.nextInt();
//        Scanner sc2=new Scanner(System.in);
//        System.out.println("Enter the Java Marks:");
//        int java_marks=sc2.nextInt();
//        Scanner sc3=new Scanner(System.in);
//        System.out.println("Enter the Sql Marks:");
//        int sql_marks=sc3.nextInt();
//        Scanner sc4=new Scanner(System.in);
//        System.out.println("Enter the Angular Marks:");
//        int angular_marks=sc4.nextInt();
//        Scanner sc5=new Scanner(System.in);
//        System.out.println("Enter the Html Marks:");
//        int html_marks=sc5.nextInt();
//        int result=(java_marks+sql_marks+angular_marks+html_marks);
//        System.out.println("Total marks obtained by the Student"+"-"+result);
//        int avg=result/4;
//        System.out.println("Total percentage obtained by the Student"+"-"+avg);
//        Grade(avg);
  }

    public static void Grade(int avg){
        if(avg>80){
            System.out.println("Grade is 'A'");
        }
        else if(avg>60){
            System.out.println("Grade is 'B'");
        }
        else if(avg>50){
            System.out.println("Grade is 'C'");
        }
        else if(avg>45){
            System.out.println("Grade is 'D'");
        }
        else if(avg>25){
            System.out.println("Grade is 'E'");
        }
        else{
            System.out.println("Grade is 'F'");
        }
    }
}

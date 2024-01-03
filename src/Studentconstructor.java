public class Studentconstructor {
    String name;
    int rollno;
    int marks1;
    int marks2;
    int marks3;
int total;
    public   Studentconstructor(){
     name="Neethu";
     rollno=27;
     System.out.println("Default Constructor"+name+" "+rollno);
    }
    public Studentconstructor(int a,int b,int c,int d){
       marks1=a;
        marks2=b;
        marks3=c;
  this.total=a+b+c;

    }
    public static void main(String[] args){
        Studentconstructor s=new Studentconstructor();
        Studentconstructor s1=new Studentconstructor(45,87,67,3);
        System.out.println("Parameterized Constructor"+ s1.marks1+" "+s1.marks2+" "+s1.marks3+" "+s1.total);
    }
}

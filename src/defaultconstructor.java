public class defaultconstructor {
    int age;
    String name;
    //Compiler written it own when run time is called default constructor
    public  defaultconstructor(){//No-argument constructor
        age=23;
        name="Sonam";
      System.out.println("Default Constructor"+age+" "+name);
    }
    public  defaultconstructor(int a,String b){//parameterized constructor
        age=a;
        name=b;
        System.out.println("Default Constructor"+age+" "+name);
    }
    public static void main(String[] args){
        defaultconstructor d=new defaultconstructor();
        defaultconstructor d1=new defaultconstructor(45,"Arvinder");

    }
}

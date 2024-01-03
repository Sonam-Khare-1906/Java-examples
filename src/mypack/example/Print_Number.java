//5.Create a class named 'PrintNumber' to print various numbers of different datatypes
 // by creating different methods with the same name 'printn' having a parameter for each datatype
package mypack.example;
public class Print_Number {
    int num;
     double numb;
    float decimal_num;
    String str;
    Long lng;
    short sht;
    boolean bln;
    char chara;
    public Print_Number(){

    }
    public int printn(int n){
        num=n;
        System.out.println("Integer Datatype:"+" "+n);
        return 0;
    }
    public static void main(String[] args){
        Print_Number p=new Print_Number();
        p.printn(5);

        p.printn("Sakshi");

        p.printn(4.25);

        p.printn(2.0f);

        p.printn(5258861483l);

        p.printn(25874);

        p.printn(true);

        p.printn('K');
    }
    public String printn(String s){
        str = s;
        System.out.println("String Datatype:"+" "+s);
        return null;
    }

    public char printn(char ch){
      chara=ch;
        System.out.println("Character Datatype:"+" "+ch);
       return chara;
    }


    public float printn(float f){
        decimal_num = f;
        System.out.println("Float Datatype:"+" "+f);
        return 0;
    }


    public double printn(double d){
        numb=d;
        System.out.println("Double Datatype:"+" "+d);
        return 0;
    }


    public long printn(long l){
        lng=l;
        System.out.println("Long Datatype:"+" "+l);
        return 0;
    }


    public short printn(short s){
        sht=s;
        System.out.println("Short Datatype:"+" "+sht);
        return 0;
    }


    public boolean printn(boolean b) {
        bln = b;
        String name = "Sonam";
        if (name.equalsIgnoreCase("khare")) {
            System.out.println("Boolean Datatype:" + " " + name);
        }
        else{
                System.out.println("Boolean not match Datatype:" + " " + name);
            }
            return true;
        }
    }

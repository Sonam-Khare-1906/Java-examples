package Collections.Java_8;


interface Tables{
    public void Multiplication(int n,int v);
}
public class table {
    public static void main(String[] args){
        Tables t=(n1,t1)->{
            int result=n1*t1;
            System.out.println("Multiplication"+result);
        };
       t.Multiplication(4,9);
    }
}

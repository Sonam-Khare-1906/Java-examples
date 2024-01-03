
public class function_4 {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(long a,long b){
        System.out.println(a+b);
    }
    void sum(int a,double b){
        System.out.println(a+b);
    }
    void sum(double a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        function_4 f= new function_4();
        f.sum(50,50);
        f.sum(50,49);
        f.sum(54,80.0);
        f.sum(50.0,54);
    }
}

package mypack_1;
//create a package which has class calculator add,sub,mul,div
//all method should hava parameter
public class calculator {
    public void add(int a,int b){
        int x=a;
        int y=b;
        int z=a+b;
        System.out.println("Addition of 2 numbers:"+z);
    }
    public void sub(int a,int b){
        int x=a;
        int y=b;
        int z=a-b;
        System.out.println("Subtraction of 2 numbers:"+z);
    }
    public void mul(int a,int b){
        int x=a;
        int y=b;
        int z=a*b;
        System.out.println("Multiplication of 2 numbers:"+z);
    }
    public void div(int a,int b){
        int x=a;
        int y=b;
        int z=a%b;
        System.out.println("Division of 2 numbers:"+z);
    }
    public void mod(int a,int b){
        int x=a;
        int y=b;
        int z=a/b;
        System.out.println("Modulus of 2 numbers:"+z);
    }
}

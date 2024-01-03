//Factorial program using recursion

public class factorial_1 {
    public static int factorial(int x){
        if(x==1){
            return 1;
        }
        else
        {
            return(x* factorial(x-1));// calling recursion
        }
    }
    public static void main(String s[]){
        int result=factorial(5);
        System.out.println(result);

    }
}

public class function_3 {
    int x = 8;
    int y = 0;
    int z = 0;
    public function_3() {
    }
    public void square(){
        int square=x*x;
        System.out.println("Square of the number:"+square);
    }
    public void square(int a)
    {
        int square=a*a;
        System.out.println("Square of the number:"+square);
    }

    public int squares(int a){ //function with return type with parameter
        return a*a;
    }
    public static void main(String[] args){
        function_3 obj=new function_3();
        obj.square();
        obj.square(5);
        System.out.println("Square of the number:"+obj.squares(6));
    }
}

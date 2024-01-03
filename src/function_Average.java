public class function_Average {
    int num1;
    int num2;
    int num3;
    public function_Average(){
        num1=5;
        num2=8;
        num3=2;
    }
    public function_Average(int n1,int n2,int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    public void Calculate(){
        int Avg=(num1+num2+num3)/3;
        System.out.println("Average of 3 no's"+" "+Avg);
    }
    public static void main(String[] args){
        function_Average f= new function_Average();
        f.Calculate();
        function_Average f1= new function_Average(8,6,9);
        f1.Calculate();
    }
}

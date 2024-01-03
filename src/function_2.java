public class function_2 {
        public function_2() {
        }

        public void even() {  //function without return type without parameter
            int x = 84;
            if (x % 2 == 0) {
                System.out.println("The number is even: " + x);
            } else {
                System.out.println("The number is odd: " + x);
            }
        }

        public void even(int a) {    // function without return type with parameter
            int x = a;
            if (x % 2 == 0) {
                System.out.println("The number is even: " + x);
            } else {
                System.out.println("The number is odd: " + x);
            }
        }
        public String even_odd(){  //function with return type without parameter
            int x=54;
            String s= x%2==0?"even":"odd";//ternary operator
            return s;
        }
        public int addition(int a,int b){ //function with return type with parameter
          int  x=a;
          int y=b;
          return a+b;
        }

        public static void main(String[] args) {
            function_2 f = new function_2();
            f.even();
            f.even(4);
            System.out.println(f.even_odd());
            System.out.println(f.addition(8,5));
        }
    }



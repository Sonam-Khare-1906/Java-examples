package mypack.example;

public class exception_1 {
    String s;

    public static void main(String[] args) {
        try {
            exception_1 ee = new exception_1();
            ee.s.length();
            System.out.println(ee.s);


            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println(c);        //Arithmetic Exception occurs
            System.out.println(a + b);

            int[] arr = new int[3];
            for (int i = 0; i <= 2; i++) {
                System.out.println(arr[i]);
            }
        }


            //it catches the Arithmetic Exception
        catch(ArithmeticException d)
            {                             //it is subclass exception
                System.out.println(d);
            }


            //It catches the null pointer Exception;
         catch(NullPointerException a){
                System.out.println(a);
            }

            catch(Exception b){          //it is parent Exception
                System.out.println("Exception handling");
                System.out.println("Hello!!!! Exception handling");
                System.out.println(b);
            }
        }
    }


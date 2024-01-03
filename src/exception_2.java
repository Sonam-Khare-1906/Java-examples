import mypack.example.exception_1;

public class exception_2 {
    String d;
    public static void main(String[] args) {
        try {
            exception_2 ee = new exception_2();
            try {
                int[] arr = new int[3];
                for (int i = 0; i <= 2; i++) {
                    System.out.println(arr[i]);
                }
            }
            catch(ArithmeticException a){
                    System.out.println("Exception handling");
                    System.out.println("Hello!!!! Exception handling");
                }
            ee.d.length();
            System.out.println(ee.d);
        }
        catch (Exception a) {
            System.out.println(a);
        }
        finally {
       System.out.println("Exception Handle");
        }
    }
}

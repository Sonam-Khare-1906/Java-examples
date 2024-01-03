public class Exception_program {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            for (int i = 0; i <= 2; i++) {
                System.out.println(arr[i]);

            }
        }catch (Exception a){
            System.out.println("Exception handling");
            System.out.println("Hello!!!! Exception handling");
        }
    }
}

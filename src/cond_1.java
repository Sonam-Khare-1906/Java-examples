public class cond_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= 10; x++) {
                System.out.println(i + "*" + x + "=" + i * x);
            }
        }
        int rows=5;
        for (int i = 1; i <= rows; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x);

            }
            System.out.println(" ");
        }
        for (int i = 5; i >= 1;i--) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x);

            }
            System.out.println(" ");
        }
    }
}

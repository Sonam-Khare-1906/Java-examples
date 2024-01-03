public class some {
    static int c=4;
    int d=5;
    some()
    {
    }
    public static void main(String[] args) {
        some s1 = new some();
        int e=c*c;//without calling
        System.out.println(e);
       int f= s1.d*s1.d;
        System.out.println(f);
     //   some s2 = new some();
      //  some s3 = new some();

    }
}

//5)Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class loops {
    public static void main(String[] args) {
//
//        for (; ; ) {
//            System.out.println("hello");
//        }
//        int j = 1;
//        for (; j <= 5; ) {
//            System.out.println("hello");
//            j++;
//        }
//        for (int k = 0; k < 10; k++) {
//            if (k == 6) {
//                break;
//            }
//                System.out.println(k);
//            }
//
//        for (int l = 0; l <= 10; l++) {
//            if (l%2==0) {
//                continue;//specify k==6 will not print
//            }
//                System.out.println(l);
//            }
        //while loop
//        int num = 1;
//        while (num < 20) {
//            int i = 1;
//            while (i < 10) {
//                System.out.println(num + "*" + i + "=" + i * num);
//                i++;
//            }
//            System.out.println(num + "*" + i + "=" + i * num);
//            num++;
//        }
//        int i=5;
//        int fac = 1;
//        while (i > 0) {
//            fac = fac * i;
//            i=i-1;
//            System.out.println(fac);
//            }
   //do while
        int i=1;
        int even=0;
        int odd=0;
        do
        {
           if(i%2==0){
              even=even+i;
           }
           else{
               odd=odd+i;
           }
            i++;
        } while(i<=100);
        System.out.println("Total Even numbers:"+even);
        System.out.println("Total Odd numbers:"+odd);
        }
    }


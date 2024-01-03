package mypack.example;

public class SubString_1 {

//    public String palindrome(SubString_1 concat){
//        StringBuffer s2 = new StringBuffer();
//        s2.reverse();
//        if (concat(s2.toString())) {
//            System.out.println(s2);
//        }
//        return "yes";
//    }

    public static void main(String[] args) {
        String str = new String("maria ");
        String s = str.substring(1, 4);
        System.out.println("Name of the First String:" + s);
        String str1 = new String("mira");
        String so = str1.substring(1, 4);
        System.out.println("Name of the Second String:" + so);
        String concat = s.concat(so);
        System.out.println("Concatenate of the String:" + concat);
    }
}
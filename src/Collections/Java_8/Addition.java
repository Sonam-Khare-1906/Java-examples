package Collections.Java_8;

 abstract class A{
     public void addition(int i,int j){
         System.out.println(i+j);
     }
     static void subtraction(int i,int j){
         System.out.println(i-j);
     }
}
class Addition extends A {
    static void subtraction(int i,int j){
        System.out.println(i+j+1);
    }

     public static void main(String[] args){
     A obj=new Addition();
     obj.addition(5,9);
     A.subtraction(9,5);
}
}

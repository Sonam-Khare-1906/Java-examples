//Abstract class can be create abstract methods,non-abstract methods
package Practice_Programs;

import java.lang.reflect.Member;

abstract class Persons{
   public abstract void hair_color();
   public void eyes_color(){
       String eyes="Black,Brown";
       System.out.println("Common Human Eyes Color are"+" "+eyes);
   }

  final void nose(){
       String nose="Depend Skin Tone";
       System.out.println("Human Skin Tone Color of Nose is"+" "+nose);

   }
     static void hand(){
       String hand="Depends on the Skin Color";
       System.out.println("Human Skin Tone Color of Nose is"+" "+hand);
   }

   public Persons(int numbers){
       numbers=5;
       System.out.println("In a Family are the"+" "+numbers+" "+"Members in a Joint Family");
   }
}
//class Per extends Persons {
//    void hair_color() {
//        String hair_color="Black and Brown";
//        System.out.println("In a Human Being Hair Color"+" "+hair_color);
//    }
//}
//public class Person {
//    public static void main(String[] args){
//        Per p=new Per();
//        p.hair_color();
//        p.eyes_color();
//    }
//}

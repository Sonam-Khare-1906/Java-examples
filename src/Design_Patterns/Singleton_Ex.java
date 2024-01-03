/* Singleton Design Pattern---only object should be created
* 1.Private Constructor cannot create Object
* 2.Static method doesn't need object directly call class name
* 3.Static member*/


package Design_Patterns;

 class user {
     private static user obj;//Static members
     private user()   //private constructor
     {}
     public static user getuser(){   //static method
         if(obj == null){
             obj=new user();
         }
         return obj;
     }
}
public class Singleton_Ex{
     public static void main(String[] args){
         user u1=user.getuser();
         System.out.println(u1.hashCode());
         user u2=user.getuser();
         System.out.println(u2.hashCode());
         user u3=user.getuser();
         System.out.println(u3.hashCode());
     }
}

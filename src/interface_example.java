public class interface_example {
    public static void main(String[] args) {
        child obj = new child();
        obj.message();
    }
}

        interface
        A{
    public  void message();

        }
   interface B{
       public  void message();

   }
 class  child implements A,B{
public void message(){
        System.out.println("Implements Interface class");
        }
        }

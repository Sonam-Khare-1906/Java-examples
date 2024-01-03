public class types {
    public types()
    {
    }
    public void even(){
        int x=84;
        if(x%2==0){
            System.out.println("The number is even:");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public void even(int a){
        int x=a;
        if(x%2==0){
            System.out.println("The number is even:");
        }
        else{
            System.out.println("The number is odd");
        }
    }

    public static void main (String args){
  types f=new types();
  f.even();
  f.even(7);
    }
}


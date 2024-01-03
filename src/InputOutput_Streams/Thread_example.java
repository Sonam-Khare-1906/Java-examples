package InputOutput_Streams;

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Thread_example {
    public static void main(String[] args){
        A obj1=new A();
        obj1.start();
        System.out.println(obj1.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);
        B obj2=new B();
        obj2.start();
    }
}

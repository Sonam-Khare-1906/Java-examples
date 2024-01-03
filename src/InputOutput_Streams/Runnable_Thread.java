package InputOutput_Streams;

public class Runnable_Thread implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args){
Runnable_Thread r=new Runnable_Thread();  // or Runnable t=new Runnable_Thread(); it will not call the another method
Thread t2=new Thread(r);
t2.start();//Only Runnable interface use i cannot call the own of the method
    }
}


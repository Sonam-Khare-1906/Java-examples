package InputOutput_Streams;

public class Runnable_Theardss implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
    public void show() {
        System.out.println("Thread is Showing");
    }

    public static void main(String[] args) {
        Runnable r = new Runnable_Thread();  // or Runnable t=new Runnable_Thread(); it will not call the another method
        Thread t2 = new Thread(r);
        t2.start();
      //  t2.show(); it show the error
    }
}

package InputOutput_Streams;

public class ThreadLifeCycle extends Thread{
    public void run() {
        System.out.println("Thread is running");
    }
    public void show(){

    }
    public static void main(String[] args) {
        ThreadLifeCycle t1=new ThreadLifeCycle();
t1.start();//to create a new Thread
        t1.run();//if we cannaot call a strat method then it call the main method not created the new thread becoz we call directly run method
    }
}

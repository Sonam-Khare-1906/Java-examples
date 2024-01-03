package InputOutput_Streams;

public class ThreadSleep extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public void show(){

    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        ThreadSleep t3 = new ThreadSleep();
        t1.start();
        try{
            t1.join();//Join method is used for 1st thread is died then only next Thread will active it will wait for 1st thread died
        }catch (Exception e){

        }
        t2.start();
        t3.start();
    }
}

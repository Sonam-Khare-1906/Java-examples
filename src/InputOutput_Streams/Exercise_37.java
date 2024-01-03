package InputOutput_Streams;

//package InputOutput_Streams;
class SynchronizedEx {
    synchronized void show(String p)
    {
        try {
            System.out.println("*****");
            System.out.println(p);
            Thread.sleep(1000);
            System.out.println("######");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread implements Runnable {
    Thread c;
    String m;
    SynchronizedEx r;

    MyThread(SynchronizedEx w, String k) {
        this.r = w;
        this.m = k;
        this.c = new Thread(this);
    }

    public void run() {
        r.show(m);
    }
}
    public class Exercise_37 {
        public static void main(String[] args) throws InterruptedException {
            SynchronizedEx d = new SynchronizedEx();
            MyThread t1 = new MyThread(d, "Hello");
            MyThread t2 = new MyThread(d, "Java");
            t1.c.start();
            t2.c.start();
            t1.c.join();
            t2.c.join();
        }
    }

package InputOutput_Streams;

class table{
 synchronized void showtable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
class mythread extends Thread{
    table t;
    mythread(table t){
        this.t=t;
    }
    public void run(){
        t.showtable(2);
    }
}
class mythreads extends Thread{
    table t;
    mythreads(table t){
        this.t=t;
    }
    public void run(){
        t.showtable(200);
    }
}
class Synchronization_exp {
    public static void main(String[] args) {
        table obj=new table();
    mythread t=new mythread(obj);
    mythreads t2=new mythreads(obj);
    t.start();
    t2.start();
    }
}
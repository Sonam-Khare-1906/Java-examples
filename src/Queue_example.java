import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_example {
    public static void main(String[] args){
       PriorityQueue <String> que=new PriorityQueue<>();
        que.add("aaaaa");
        que.add("ghhhj");
        que.add("rtyui");
        que.add("uiop");
        que.add("fgkkl");
//        que.offer(null);
        que.add("bhavani");
        que.add("bhavani");
//        System.out.println(que);
//        System.out.println(que.remove());
//        System.out.println(que.poll());
//        System.out.println(que.offer("aaaaa"));
        Iterator it= que.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(que);
        for(Object obj: que.toArray()){
            System.out.println(obj);
        }
//        que.clear();
//      que.peek();
//       System.out.println(que);
     //   que.clear();
//        que.poll();
//        System.out.println(que);


    }
}

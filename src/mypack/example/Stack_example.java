package mypack.example;


import java.util.List;
import java.util.Stack;

public class Stack_example {
    public static  void main(String[] args){
        Stack<Integer> stack =new Stack<>();
        boolean s=stack.empty();
        System.out.println("Stack is empty or not"+" "+s);

        stack.push(52);
        stack.push(26);
        stack.push(78);
        stack.push(10);
        stack.push(27);
        stack.push(30);
        stack.push(15);
        stack.push(36);
      System.out.println("List of the elements:"+stack);

        int st=stack.search(27);
        System.out.println("Search the element:"+st);

       int peek= stack.peek();
        System.out.println("Peek the element:"+peek);

        int pop=stack.pop();
        System.out.println("Pop the element:"+pop);
        System.out.println("List of the elements:"+stack);

        int specific_value= stack.indexOf(15,4);
        System.out.println("List of the elements:"+specific_value);
        System.out.println("List of the elements:"+stack);

        int str=stack.capacity();
        System.out.println("List of the elements:"+str);

        List<Integer> rev=stack.reversed();
        System.out.println("List of the elements in reverse order:"+rev);

        stack.trimToSize();
        System.out.println("List of the elements:"+stack);
        int str1=stack.capacity();
        System.out.println("List of the Stack Size:"+str1);

        int str2=stack.size();
        System.out.println("List of the Stack Size:"+str2);
    }
}

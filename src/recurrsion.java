public class recurrsion {
    public static int add(int x){
        if(x>0){
            return x+add(x-1);//calling itself is a recursion until it becomes 0
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int result=add(10);
        System.out.println(result);
    }
}

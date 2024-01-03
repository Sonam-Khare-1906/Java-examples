public class function_Rectangle {
    int length;

    int breadth;

    public function_Rectangle(){
       length=4;
       breadth=5;
    }
    public function_Rectangle(int l,int b1){
        length=l;
        breadth=b1;
    }
    public void Area(){
        int Area=breadth*length;
        System.out.println("Area of the Rectangle"+Area);
    }
    public static void main(String[] args){
        function_Rectangle f=new function_Rectangle();
        f.Area();
        function_Rectangle f1=new function_Rectangle(5,8);
        f1.Area();
    }
}

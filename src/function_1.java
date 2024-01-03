
public class function_1 {

    int num;
    String name;
    //Constructor
public  function_1(){
    num=50;
    name="Edubridge";
}

//method
public void display(){
    System.out.println(num+" "+name);
}
//to calling function to the create a object
public static void main(String[] args){
    function_1 f=new function_1();
    f.display();
}
}




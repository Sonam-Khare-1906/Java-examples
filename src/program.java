public class program {
    public static void main(String[] args){
        Resizable obj=new Rectact();
        obj.resizeHeight(45);
        obj.resizeWidth(78);
    }
}
interface Resizable{
    public int resizeWidth(int i);
    public  int  resizeHeight(int i);
}
 class Rectact implements Resizable{
    public int resizeWidth(int b) {
        System.out.println("Resizable width:"+b);
        return b;
    }
    public  int resizeHeight(int c){
        System.out.println("Resizable Height:"+c);
        return c;

    }

}

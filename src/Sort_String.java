import java.util.Arrays;

public class Sort_String {
    public static void main(String[] args){
        String[] str=new String[] {"Zimbabwe","Singapore","Dubai","Canada","London","Australia","Antarctica","Zealand"};
        System.out.println(Arrays.toString(str));
        System.out.println("After Sorting");
        for(int i=0;i< str.length;i++){
            for(int j=i+1;j< str.length;j++){
                String temp=" ";
                if(str[i].compareTo(str[j])<0){
                    temp= str[i];
                    str[i]=str[j];
                    str[j]= temp;
                }
            }
        }
        for(int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }
}

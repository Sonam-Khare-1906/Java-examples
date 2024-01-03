//10.write a java program to check if a string  array contains a specific element
import java.util.Scanner;
public class String_10 {
    public static void main(String[] args) {
        String []str ={"Subhramanyam","Kiran","Bindu","Kameshwari","Jagadish","Bhargav","Tripthi","Aswini","Chetna"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Subhramanyam"+","+"Kiran"+","+"Bindu"+","+"Kameshwari"+","+"Jagadish"+","+"Bhargav"+","+"Tripthi"+","+"Aswini"+","+"Chetna");
        System.out.println("Choose any word from the list");
        String choosenword = sc.nextLine();
        boolean string = false;
        for (String s : str) {
            if (s.equalsIgnoreCase(choosenword)) {
                string = true;
                break;
            }
        }
            if (string) {
                System.out.println("Choosen word is Occurence of the String");
            } else {
                System.out.println("Choosen word is not Occurence of the String");
            }
        }
    }


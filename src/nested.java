public class nested {
    public static void main(String[] args){
        int Student=2020;
        int Age=28;
        String str ="ComputerScience";
        int overallper=70;
        if (Student == 2020) {
        if(Age>=25) {
            if (str.equals("ComputerScience")) {
                if (overallper >= 60) {
                    System.out.println("Student eligible for this job");

                }
            }
        }
        }
        else{
            System.out.println("Student are not eligible for this job");
        }
    }
}

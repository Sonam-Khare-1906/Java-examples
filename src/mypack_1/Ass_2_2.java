//2.	The total number of students in a class are 90 out of which 45 are boys.
// If 50% of the total students secured grade 'A' out of which 20 are boys,
// then write a program to calculate the total number of girls getting grade 'A'.
package mypack_1;
    public class Ass_2_2 {
        int Total_Students;
        int boys;
        int out_of_boys=20;
        public Ass_2_2(){

        }
        public void calculate(int a,int b){
            Total_Students=a;
            boys=b;
            int total_girls=Total_Students-b;
            int girsl_A=total_girls-out_of_boys;
            System.out.println("Total number of girls:"+total_girls);
            System.out.println("Total number of A grade girls:"+girsl_A);
            System.out.println("Total number of A grade boys:"+out_of_boys);
}
        public static  void main(String[]args){
            Ass_2_2 obj=new Ass_2_2();
            obj.calculate(90,45);
        }
}


